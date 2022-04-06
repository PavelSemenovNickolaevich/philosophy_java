create or replace function should_increase_salary(
    cur_salary numeric,
    max_salary numeric DEFAULT 80,
    min_salary numeric DEFAULT 30,
    increase_rate numeric DEFAULT 0.2
) returns bool AS
$$
declare
    new_salary numeric;
begin
    if min_salary > max_salary then
        raise exception 'Min salary should not exceed max. Min is %, Max is %', min_salary, max_salary;
    end if;

    if max_salary < 0 or min_salary < 0 then
        raise exception 'Min and max salary should be >= 0. Min is %, Max is %', min_salary, max_salary;
    end if;

    if increase_rate < 0.05 then
        raise exception 'Increase rate should be >= 0.05. You passed in % ', increase_rate;
    end if;

    if cur_salary >= max_salary or cur_salary >= min_salary then
        return false;
    end if;

    if cur_salary < min_salary then
        new_salary = cur_salary + (cur_salary * increase_rate);
    end if;

    if new_salary > max_salary then
        return false;
    else
        return true;
    end if;
end;
$$ language plpgsql;


select should_increase_salary(40, 80,30, 0.2);
select should_increase_salary(79, 81,80, 0.2);
select should_increase_salary(79, 95,90, 0.2);
