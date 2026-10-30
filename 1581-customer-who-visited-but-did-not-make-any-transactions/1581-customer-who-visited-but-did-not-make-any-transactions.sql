SELECT customer_id , COUNT(customer_id) AS count_no_trans


FROM Visits v LEFT JOIn Transactions t
ON v.visit_id = t.visit_id
WHERE t.transaction_id IS null
GROUP BY v.customer_id