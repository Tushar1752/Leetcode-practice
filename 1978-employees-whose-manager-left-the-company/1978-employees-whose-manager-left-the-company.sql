# Write your MySQL query statement below
SELECT employee_id FROm Employees WHERE
salary < 30000
AND manager_id NOT In (SELECT employee_id FROM Employees)
ORDER BY employee_id;