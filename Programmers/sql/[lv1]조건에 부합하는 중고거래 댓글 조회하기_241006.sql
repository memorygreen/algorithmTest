-- 241006
-- LV1
-- 조건에 부합하는 중고거래 댓글 조회하기
-- https://school.programmers.co.kr/learn/courses/30/lessons/164673
SELECT B.TITLE, B.BOARD_ID, R.REPLY_ID, R.WRITER_ID
     , R.CONTENTS, DATE_FORMAT(R.CREATED_DATE, '%Y-%m-%d') AS CREATED_DATE
  FROM USED_GOODS_BOARD B
 INNER JOIN USED_GOODS_REPLY R
 ON B.BOARD_ID =  R.BOARD_ID
 WHERE DATE_FORMAT(B.CREATED_DATE, '%Y-%m') = '2022-10'
 ORDER BY R.CREATED_DATE, B.TITLE;

 -- 자영 정답에서 힌트를 얻어버림 WHERE 조건 게시글 작성일 기준이다!