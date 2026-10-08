# Write your MySQL query statement below
SELECT a1.machine_id , ROUND(AVG(a2.timestamp - a1.timestamp),3) AS processing_time
From Activity a1
Join Activity a2
ON a1.machine_id = a2.machine_id
AND a1.process_id = a2.process_id

Where a1.activity_type = 'start'
and a2.activity_type = 'end'
GROUP by a1.machine_id;