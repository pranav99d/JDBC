/*Write a SQL statement that finds out each order number followed
 by the name of the customers who made the order.*/


Select orders.ord_no, customer.cust_name
from customer, orders
where customer.customer_id = orders.customer_id
