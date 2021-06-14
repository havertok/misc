-- Pretty hard to follow and somewhat slow.  Dense_rank is used in case of duplicates (i.e. salaries of
-- 100. 100. 50 will have ranking of 1, 1, 2.  Using ROWNUM would return the second 100 (which is tied)

SELECT
    (SELECT SAL FROM 
        (SELECT DISTINCT SALARY AS SAL, DENSE_RANK() 
            OVER (ORDER BY SALARY DESC) AS RN FROM EMPLOYEE) 
     WHERE RN = 2) AS SECONDHIGHESTSALARY
FROM DUAL;