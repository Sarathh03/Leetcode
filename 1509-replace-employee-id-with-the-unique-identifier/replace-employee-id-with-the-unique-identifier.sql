# Write your MySQL query statement below
select em.unique_id, e.name from employees as e left join employeeuni as em
on e.id = em.id;