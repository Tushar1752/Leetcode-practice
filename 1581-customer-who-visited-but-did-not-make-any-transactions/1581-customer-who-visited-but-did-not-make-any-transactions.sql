# Write your MySQL query statement below
SELECT v.customer_id , COUNT(*) AS count_no_trans FROM Visits v left join Transactions t on 
v.visit_id = t.visit_id
where t.transaction_id  is null
Group by v.customer_id;