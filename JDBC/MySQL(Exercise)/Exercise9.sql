/* Write a SQL statement to find the names of all customers 
along with the salesmen who works for them */

select customer.cust_name, salesman.name
FROM customer, salesman
where customer.salesman_id = salesman.salesman_id
