CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
        select distinct salary from(select salary , DENSE_RANK() over (order by salary desc) as salaryOrder from Employee)as t where salaryOrder=N

  );

END