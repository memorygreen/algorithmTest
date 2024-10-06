-- 241006
-- lv2
-- 조건에 맞는 개발자 찾기
-- https://school.programmers.co.kr/learn/courses/30/lessons/276034

SELECT ID, EMAIL, FIRST_NAME, LAST_NAME
  FROM DEVELOPERS 
  WHERE (SKILL_CODE & (SELECT CODE FROM SKILLCODES WHERE NAME LIKE 'Python'))
        OR (SKILL_CODE & (SELECT CODE FROM SKILLCODES WHERE NAME LIKE 'C#'))
 ORDER BY ID ASC
 
 
  -- https://school.programmers.co.kr/questions/72683
  
  -- BIN() 함수는 이진수 문자열로 반환하기 때문에 WHERE 절에서 BIN(SKILL_CODE) 와 SELECT문으로 조회한 정수 CODE와 비교하면 원하는대로 비교가 안될수 있다!->그래서 실패가 뜬 것!
