SELECT Distinct class
FROM Courses
Group by class
Having count(student) >= 5;