SELECT 
    MONTH(START_DATE) AS MONTH,
    CAR_ID, 
    COUNT(*) AS RECORDS
FROM 
    CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE 
    MONTH(START_DATE) BETWEEN 8 AND 10
AND 
    CAR_ID IN (SELECT 
                    CAR_ID
               FROM
                    CAR_RENTAL_COMPANY_RENTAL_HISTORY
               WHERE
                    START_DATE BETWEEN '2022-08-01' AND '2022-10-31'
               GROUP BY
                    CAR_ID
               HAVING 
                    COUNT(CAR_ID) >= 5)
GROUP BY 
    MONTH, CAR_ID
ORDER BY 
    MONTH, CAR_ID DESC