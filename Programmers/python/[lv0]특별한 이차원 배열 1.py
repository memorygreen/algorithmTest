

# main start!

n = 3		#TC no.1
#n = 6		#TC no.2
#n = 1		#TC no.3

# main end!

def solution(n):
    # 2차원 리스트의 바깥쪽 리스트 생성
    answer = []
    
    for i in range(n):
        # 행 단위(안쪽 리스트) 추가
        arr = []
        for j in range(n):
            # 행(i)과 열(j) 번호가 같다면 행에 값 1추가
            if i == j :
                arr.append(1)
            # 행과 열 번호가 같지 않다면 행에 값 0추가
            else:
                arr.append(0)
        # 1개의 행을 다 채우면 2차원 리스트에 행을 추가
        answer.append(arr)
            
    return answer

print(solution(n)) 
