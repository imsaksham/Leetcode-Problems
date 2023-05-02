# Write your MySQL query statement below
select e.name as Employee from employee e INNER JOIN Employee m ON e.managerId = m.id where e.salary > m.salary