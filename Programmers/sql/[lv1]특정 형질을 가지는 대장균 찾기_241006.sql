-- 241006
-- lv1
-- 특정 형질을 가지는 대장균 찾기
-- https://school.programmers.co.kr/learn/courses/30/lessons/301646

SELECT COUNT(*) AS COUNT
  FROM ECOLI_DATA
  WHERE BIN(GENOTYPE) & 2 = 0 -- 0010 => 2번 형질이 아닌 것
        AND (BIN(GENOTYPE) & 1 -- 0001=> 1번 형질 확인
            OR BIN(GENOTYPE) & 4) -- 0100 => 3번 형질 확인
        
-- 2진수로 변환하는 함수
-- => BIN()

-- 비트연산자
-- & : 대응되는 비트가 모두 1이면 1을 반환함. (AND 연산)
-- | : 대응되는 비트 중에서 하나라도 1이면 1을 반환함. (OR 연산)
-- ^ : 대응되는 비트가 서로 다르면 1을 반환함. (XOR 연산)
-- ~ : 비트를 1이면 0으로, 0이면 1로 반전시킴. (NOT 연산)
-- << : 지정한 수만큼 비트를 전부 왼쪽으로 이동시킴. (left shift 연산)
-- >> : 부호를 유지하면서 지정한 수만큼 비트를 전부 오른쪽으로 이동시킴. (right shift 연산)
-- 출처: https://arajo.tistory.com/312 [아라 메모장:티스토리]