# 260327

# main start!

arr = [1, 2, 3, 100, 99, 98]		#TC no.1


# main end!

def solution(arr):
    answer = []
    for i in range(len(arr)):
        if (arr[i] % 2 == 0) and (arr[i] >=50):
            answer.append(arr[i]/2)
        elif (arr[i] % 2 == 1) and (arr[i] < 50):
            answer.append(arr[i] * 2)
        # 입출력 예 -> "나머지 값들은 변경 조건에 해당하지 않으므로 바꾸지 않습니다"
        else:
            answer.append(arr[i])
    return answer


print(solution(arr)) 