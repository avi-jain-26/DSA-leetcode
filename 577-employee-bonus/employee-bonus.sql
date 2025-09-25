# Write your MySQL query statement below
select a.name, b.bonus from Employee a
left join bonus b ON a.empId = b.empId
where b.bonus <1000  OR b.bonus IS NULL;