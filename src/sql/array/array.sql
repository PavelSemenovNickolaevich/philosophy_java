create or replace function filter_even(variadic numbers int[]) returns setof int as $$
declare
 counter int;
begin
foreach counter in array numbers
loop
 continue when counter % 2 != 0;
 return next counter;
 end loop;

end;
$$langugae plpgsql;

select from filter_even(1,2,3,4,5,6)


-- Создать функцию, которая вычисляет средний фрахт по заданным странам (функция принимает список стран).

create or replace function get_avg_freight_by_countries(variadic countries text[]) returns float8 as
    $$
     select avg(freight)
    from orders
    where ship_country = any(countries)
    $$ language sql;

select get_avg_freight_by_countries('USA', 'UK');