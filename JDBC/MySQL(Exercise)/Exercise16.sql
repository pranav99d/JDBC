/* Write a query to find the 4th minimum salary in the employees table*/

SELECT DISTINCT salary 
FROM employees a 
WHERE 4 = (SELECT COUNT(DISTINCT salary) 
FROM employees b 
WHERE b.salary <= a.salary);
