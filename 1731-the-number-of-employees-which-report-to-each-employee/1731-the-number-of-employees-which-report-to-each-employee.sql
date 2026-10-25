SELECT mgr.employee_id, mgr.name, COUNT(emp.employee_id) AS reports_count, ROUND(AVG(emp.age)) AS average_age FROM Employees mgr Inner Join Employees emp 
ON mgr.employee_id = emp.reports_to
GRoup By mgr.employee_id, mgr.name
Order By mgr.employee_id;