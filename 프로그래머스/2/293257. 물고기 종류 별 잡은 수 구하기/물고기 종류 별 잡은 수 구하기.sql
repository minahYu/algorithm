-- 코드를 작성해주세요
SELECT COUNT(*) as FISH_COUNT, 
       fni.FISH_NAME 
FROM FISH_INFO as fi
    JOIN FISH_NAME_INFO as fni
    ON fi.FISH_TYPE = fni.FISH_TYPE
GROUP BY fni.FISH_NAME
ORDER BY FISH_COUNT DESC;