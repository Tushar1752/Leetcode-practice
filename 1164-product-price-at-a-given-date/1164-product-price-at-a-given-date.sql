SELECT product_id, new_price As price FROM Products
WHERE (product_id, change_date) IN (
    SELECT product_id, Max(change_date) from Products
    WHERE change_date <= '2019-08-16'
    Group by product_id
)
UNION ALL

SELECT product_id, 10 AS price
From Products GRoup By product_id 
Having min(change_date)>'2019-08-16';