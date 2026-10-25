SELECT employee_id, department_id
FROM Employee
WHERE primary_flag = 'Y'

UNION 

SELECT employee_id, department_id
FROM Employee
GROUP By employee_id
Having count(*) = 1;