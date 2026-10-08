SELECT product_name , year, price FROM Sales Left join Product ON
Sales.product_id = Product.product_id;