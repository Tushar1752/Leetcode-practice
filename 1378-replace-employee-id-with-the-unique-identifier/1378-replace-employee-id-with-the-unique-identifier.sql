SELECT eu.unique_id, e.name FROM Employees e
LEFT JOin EmployeeUNI eu 
ON e.id = eu.id;