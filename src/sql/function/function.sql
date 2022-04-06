create or replace function get_max_from_discontinued() returns real as
$$
BEGIN
    return sum(northwind.public.products.unit_price)
        from ;

end;
$$ language plpgsql;