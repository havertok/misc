/* Write your PL/SQL query statement below */
SELECT EMAIL FROM (
    SELECT EMAIL, COUNT(*) FROM PERSON GROUP BY EMAIL HAVING COUNT(*) > 1);