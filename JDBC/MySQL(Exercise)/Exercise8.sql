/*Write a query to find those customers with their name and those
 salesmen with their name and city who lives in the same city.*/

SELECT customer.cust_name, customer.city, salesman.name, salesman.city
from customer, salesman
where customer.city = salesman.city
