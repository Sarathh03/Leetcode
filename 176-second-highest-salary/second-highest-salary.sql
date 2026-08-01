# Write your MySQL query statement below
select  Max(salary) as secondhighestsalary from employee
where salary < (select max(salary) from employee)
limit 1;