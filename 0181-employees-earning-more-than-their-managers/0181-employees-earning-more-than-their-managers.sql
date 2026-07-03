# Write your MySQL query statement below
-- select Employee.name form Employee where  (Employee.managerId=Employee.id) and 

select e.name as Employee from Employee e inner join Employee m on e.managerid=m.id and m.salary<e.salary;