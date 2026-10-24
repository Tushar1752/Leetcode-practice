SELECT max(num) as num from (
    SELECT num
    FROM MyNumbers
    GROUP by num
    Having COUNT(*) = 1
    
) AS SingleNumbers;