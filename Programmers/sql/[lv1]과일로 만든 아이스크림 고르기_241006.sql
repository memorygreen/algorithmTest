-- 241006 일
-- lv1
-- https://school.programmers.co.kr/learn/courses/30/lessons/133025
-- 과일로 만든 아이스크림 고르기
SELECT F.FLAVOR
  FROM FIRST_HALF F
  INNER JOIN ICECREAM_INFO I
          ON F.FLAVOR =  I.FLAVOR
 WHERE TOTAL_ORDER > 3000 AND INGREDIENT_TYPE = 'fruit_based';

 