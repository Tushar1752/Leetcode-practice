# Write your MySQL query statement below
SELECT contest_id , ROUND(COUNT(user_id)*100.0/(SELECT COUNT(*) FROM Users),2) As percentage 
FROM Register
GROUP By contest_id

ORDER BY percentage DESC, contest_id ASC;