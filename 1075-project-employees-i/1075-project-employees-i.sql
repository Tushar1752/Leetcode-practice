SELECT p.project_id , ROUND(COALESCE(AVG(e.experience_years),0),2) AS average_years
FROM Project p JOin Employee e ON
p.employee_id = e.employee_id
GROUP BY p.project_id;