begin transaction isolation level repeatable read;

drop table if exists archive_poor_customers as
 select customer_id, company_name, sum(unit_price * quantity) as total
 from orders
 join order_details using(order_id)
 join customers using(customer_id)
 group by company_name, customer_id
 having sum(unit_price * quantity) < 200
 order by sum(unit_price * quantity) desc;

 delete from order_details
 where order_id in (select order_id
				   from orders
				   where customer_id in
					(select customer_id from archive_poor_customers)
				);
 delete from orders
 where customer_id in(select customer_id from archive_poor_customers);

 delete from customers
 where customer_id in(select customer_id from archive_poor_customers);

 commit;

end;


begin;
create table archive_dicounted_products as
select  * from products where discounted = 1;

savepoint archive_dicounted;

 delete from order_details
 where product_id in(select product_id from archive_dicounted_products);

 delete from products
 where discounted = 1;

 rollback to archive_dicounted;

 commit;



