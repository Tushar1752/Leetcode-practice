SELECT MAX(e2.salary) AS SecondHighestSalary
FROM Employee e1 INNER JOIN Employee e2
On e1.salary > e2.salary;