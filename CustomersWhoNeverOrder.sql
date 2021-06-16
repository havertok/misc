--Two ways of doing it here, note that customerID is in orders but only for customers
--who have in fact ordered at some point, customer table has only id and name (id is foreign key
--in orders)
--Times vary so widely I'm not sure what's faster

SELECT NAME AS CUSTOMERS FROM
    (SELECT ID, NAME FROM
        CUSTOMERS WHERE ID NOT IN (
            SELECT CUSTOMERID FROM ORDERS));
			
SELECT c.name as Customers FROM
        CUSTOMERS c WHERE c.ID NOT IN (
            SELECT CUSTOMERID FROM ORDERS);