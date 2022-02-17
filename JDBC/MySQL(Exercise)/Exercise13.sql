/*Write a query to list the department ID and name of all 
the departments where no employee is working.*/

Select departments.DEPARTMENT_ID, departments.DEPARTMENT_NAME
FROM departments, employees
where departments.DEPARTMENT_ID != employees.DEPARTMENT_ID
