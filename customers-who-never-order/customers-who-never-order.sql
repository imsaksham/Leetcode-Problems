# Write your MySQL query statement below
select c.name as Customers from customers c where c.id NOT IN (select customerId from orders);