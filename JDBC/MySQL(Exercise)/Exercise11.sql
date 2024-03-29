/*Write a SQL statement that sorts out the customer and their grade
 who made an order. Each of the customers must have a grade and 
 served by at least a salesman, who belongs to a city.*/

SELECT customer.cust_name,
customer.grade, orders.ord_no
FROM orders, salesman, customer
WHERE orders.customer_id = customer.customer_id
AND orders.salesman_id = salesman.salesman_id
AND salesman.city IS NOT NULL
AND customer.grade IS NOT NULL
order by cust_name;
