/*Write a query that produces all customers with their name, city, 
salesman and commission, who served by a salesman and the salesman 
works at a rate of the commission within 12% to 14%*/

select customer.cust_name, customer.city, salesman.name,
salesman.commission
from customer, salesman
where customer.salesman_id = salesman.salesman_id
and salesman.commission
between .12 and .14;
