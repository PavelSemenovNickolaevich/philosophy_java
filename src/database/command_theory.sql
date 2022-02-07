CREATE DATABASE company_repository;

CREATE SCHEMA company_storage;

CREATE TABLE company_storage.company (
    id INT PRIMARY KEY,
    name VARCHAR(128) UNIQUE NOT NULL,
    date DATE NOT NULL CHECK ( date >  '1995-01-01' AND date < '2020-01-01')
);

DROP TABLE  company_storage.company;

INSERT INTO company_storage.company(id, name, date)
VALUES (1, 'Google', '2001-01-01'),
       (2, 'Apple', '2002-01-01'),
       (3, 'FACEBOOK', '1998-01-01');

CREATE TABLE employee(
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(128) NOT NULL,
    last_name VARCHAR(128) NOT NULL,
    company_id INT REFERENCES  company (id) ON DELETE CASCADE ,
    salary INT,
    UNIQUE (first_name, last_name)
--     FOREIGN KEY (company_id) REFERENCES company

);

DROP table employee;

INSERT INTO employee(first_name, last_name, salary, company_id)
VALUES
       ( 'Ivan', 'Ivanov', 690, 1),
       ( 'Ivan', 'Sidorov', 500, 1),
       ( 'Arni', 'PAramonov', null, 2),
       ( 'Boris', 'Borisov', 500, 3),
       ( 'Petr', 'Petrov', 200, null);

SELECT DISTINCT id,
                first_name f_name,
                last_name l_name,
                salary
FROM employee empl
WHERE salary IN (200, 500) OR first_name LIKE 'Iv%'
ORDER BY salary DESC ;
-- > <  >= <= = !=
-- BETWEEN
--LIKE (ILIKE)
-- IN
-- LIMIT 3
-- OFFSET 2;

-- агрегирующие функции
-- sum , avg, max, min , count
SELECT
 sum(salary)
FROM employee empl;


SELECT
id ,first_name
FROM
employee
WHERE  company_id IS NOT NULL
-- UNION ALL
UNION
SELECT
    id, first_name
FROM
    employee
WHERE salary IS NULL;

SELECT
 avg(salary)
 FROM  (SELECT  *
        FROM employee
        ORDER BY salary
        LIMIT 2) empl;

SELECT  *
FROM employee
ORDER BY salary
LIMIT 2;


DELETE FROM employee
WHERE salary = (SELECT max(salary) FROM employee);

SELECT *
FROM employee;

UPDATE employee
SET  company_id = 2,
    salary = 1700
WHERE id = 2
RETURNING *;