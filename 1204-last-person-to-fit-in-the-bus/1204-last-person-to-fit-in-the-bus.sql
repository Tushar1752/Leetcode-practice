SELECT person_name FRom (
    SELECT person_name , turn, SUM(weight) OVER (ORDER By turn) AS total_weight
    FROM Queue

) AS q
WHERE total_weight <=1000
ORDER BY turn DESC
Limit 1;