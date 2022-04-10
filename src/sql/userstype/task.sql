---1----
create type price_bounds as
(
    min_price numeric,
    max_price numeric
);


create or replace function get_salary_boundaries_by_city(emp_city varchar)
    returns setof price_bounds
AS
$$
SELECT MIN(salary) AS min_salary,
       MAX(salary) AS max_salary
FROM employees
WHERE city = emp_city
$$ language sql;



-----2--------


create type army_rank as enum ('Private', 'Corporal', 'Sergeant');
select enum_range(null::army_rank);

alter type army_rank
    add value 'Major' after 'Sergeant';

create table personnel
(
    person_id   serial primary key,
    first_name  text,
    last_name   text,
    person_rank army_rank
);

insert into personnel(first_name, last_name, person_rank)
values ('Donald', 'Boyd', 'Private'),
       ('Alonzo', 'Duncan', 'Sergeant');

select * from personnel;