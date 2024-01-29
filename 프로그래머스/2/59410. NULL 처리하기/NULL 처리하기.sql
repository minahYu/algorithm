-- 코드를 입력하세요
SELECT 
    ANIMAL_TYPE, 
    IFNULL(name, 'No name') AS NAME, 
    SEX_UPON_INTAKE
FROM ANIMAL_INS
ORDER BY animal_id ASC;