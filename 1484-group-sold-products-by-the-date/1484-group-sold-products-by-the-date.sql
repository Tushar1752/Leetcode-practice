SELECT sell_date , COUNT(DISTINCT product) AS num_sold,
GROUP_CONCAT(
    DISTINCT product
    ORDER by product
    SEparator ','

)
AS products


FROM Activities
GROUP By sell_date
Order By sell_date, product