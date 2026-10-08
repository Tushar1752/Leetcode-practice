# Write your MySQL query statement below
SELECT e.name , b.bonus FROM Employee e Left Join Bonus b
On e.empId = b.empId
WHERE b.bonus<1000 Or b.bonus is null
;