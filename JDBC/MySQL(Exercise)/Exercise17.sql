/*Write a query to display the employee ID, first name, last name, 
salary of all employees whose salary is 
above average for their departments.*/

select employees.EMPLOYEE_ID, employees.LAST_NAME, employees.SALARY
from employees 
where employees.SALARY >
(select avg(employees.SALARY) from employees );
