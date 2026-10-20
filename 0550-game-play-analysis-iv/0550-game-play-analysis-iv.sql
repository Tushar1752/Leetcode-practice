# Write your MySQL query statement below
SELECT ROUND(COUNT(DISTINCT a.player_id)/(SELECT COUNT(DISTINCT player_id)FROM Activity ),2) AS fraction
FROM Activity a
WHERE EXISTS(
    SELECT 1 
    FROM Activity b
    WHERE b.player_id = a.player_id
    AND b.event_date = DATE_ADD(
        (SELECT MIN(event_date)
        FROM Activity
        WHERE player_id = a.player_id),
        INTERVAL 1 DAY
    )
);