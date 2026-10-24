SELECT customer_id from Customer
GROUP by customer_id
Having COUNT(DISTINCT product_key) = (SELECT COUNT(*) from Product);