# 260328🔥
# main start!
# 정수 l과 r이 주어졌을 때,
#  l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진
#  모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
# 만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
l = 5		#TC no.1
r = 555		#TC no.1
#l = 10		#TC no.2
#r = 20		#TC no.2

#  5, 50, 55, 500, 505, 550, 555
# main end!

def solution(l, r):
    answer = []

    
    for i in range(l,r+1,1):
        is_ck = True # 확인용 스위치 만들기
            
        # 한개의 숫자 안의 각각 자릿수가 0 or 5인지 확인 필요
        for j in str(i):
            
            if "5" != j and "0" != j:
                is_ck = False
                break
        
        if is_ck:
            answer.append(i)
        
        
    if len(answer)==0:
        answer.append(-1)
        
    return sorted(answer)

print(solution(l, r))
