select distinct employee_id, total_by_emp, avg(total_by_emp) over() as avg_price
from
    (
        select employee_id, sum(unit_price*quantity) over (partition by employee_id) as total_by_emp
        from orders
                 left join order_details using(order_id)
    ) q
order by total_by_emp DESC;


select last_name, first_name, title, salary, DENSE_RANK() OVER(ORDER BY salary DESC)
from employees;