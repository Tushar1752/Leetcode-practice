SElect 'Low Salary' AS category, Count(*) AS accounts_count FROM Accounts
WHERE income < 20000

UNION ALL

SElect 'Average Salary' AS category, Count(*) AS accounts_count FROM Accounts
WHERE income Between 20000 AND 50000


UNION ALL

SElect 'High Salary' AS category, Count(*) AS accounts_count FROM Accounts
WHERE income > 50000


;