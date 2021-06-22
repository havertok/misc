/* Write your PL/SQL query statement below */
-- https://leetcode.com/problems/rising-temperature/submissions/
SELECT w2.id
    FROM Weather w1, Weather w2
    WHERE w2.recordDate - w1.recordDate = 1 AND w2.Temperature > w1.Temperature;


-- tried using case, didn't work
-- SELECT CASE WHEN x.temperature > y.temperature then 'noIssue' else 'issue' end
--  FROM WEATHER x JOIN WEATHER y USING(id)
--  WHERE x.recorddate > y.recorddate;