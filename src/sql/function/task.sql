--1--

create or replace function backup_customers() returns void as
$$
drop table if exists backedup_customers;

select
into backedup_customers
from customers;

    --create table backedup_customers as
    --  select * from customers
$$ language sql;

select backup_customers();

select count(*)
from backedup_customers();


--2--
create or replace function get_avg_freight() returns float8 as
$$

select avg(freight)
from orders;

$$ language sql;

select *
from get_avg_freight();

--3--

create or replace function random_between(low int, high int) returns int as
$$

begin
    return floor(random() * (high - low + 1) + low);
end;

$$ language plpgsql;

select random_between(1, 3)
from generate_series(1, 5)

--4--

create or replace function get_salary_bounds_by_city(emp_city varchar, out min_salary numeric, out max_salary numeric) as
$$
select min(salary), max(salary)
from eployees
where city = emp_city
$$ language sql;

select *
from get_salary_bounds_by_city('London')

--5--
create or replace function correct_salary(upper_boundary numeric default 70, correction_rate numeric default 0.15)
    returns void as
$$
update employees
set salary = salary + (salary * correction_rate)
where salary = upper_boundary

$$ language sql;


--6--
drop function if exists correct_salary;
create or replace function correct_salary(upper_boundary numeric default 70, correction_rate numeric default 0.15)
    returns setof employee as
$$
update employees
set salary = salary + (salary * correction_rate)
where salary = upper_boundary
returning *;

$$ language sql;


-----7-----
drop function if exists correct_salary;
create or replace function correct_salary(upper_boundary numeric default 70, correction_rate numeric default 0.15)
    returns table
            (
                last_name  text,
                first_name text,
                title      text,
                salary     numeric
            )
as
$$
update employees
set salary = salary + (salary * correction_rate)
where salary <= upper_boundary
returning (last_name, first_name, title, salary)

$$ language sql;

select *
from correct_salary();
select salary
from employee
order by salary;


----8----

create or replace function get_orders_by_shipping(ship_method int) returns setof orders as
$$
declare
    average numeric;
    maximum numeric;
    middle  numeric;
begin
    select max(freight)
    into maximum
    from orders
    where ship_via = ship_method;

    select avg(freight)
    into average
    from orders
    where ship_via = ship_method;

    maximum = maximum - (maximum * 0.3);

    middle = (maximum + average) / 2;

    return query
        select *
        from orders
        where freight < middle;

end;
$$ language plpgsql;

select *
from get_orders_by_shipping(1);


-----9------
create or replace function should_increase_salary(cur_salary numeric,
                                                  max_salary numeric default 80,
                                                  min_salry numeric default 30,
                                                  increase_rate numeric default 0.2) returns bool as
$$
declare
    new_salary numeric;
begin
    if cur_salary >= max_salary or cur_salary >= min_salry then
        return false;
    end if;

    if cur_salary < min_salry then
        new_salary = cur_salary + (cur_salary * increase_rate);
    end if;

    if new_salary > max_salary then
        return false;
    else
        return true;
    end if;
end;

$$
    language plpgsql;

select should_increase_salary(40, 80,30, 0.2);
select should_increase_salary(79, 81,80, 0.2);
select should_increase_salary(79, 95,90, 0.2);

