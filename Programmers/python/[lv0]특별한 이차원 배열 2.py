

# main start!

arr = [[5, 192, 33], [192, 72, 95], [33, 95, 999]]		#TC no.1
#arr = [[19, 498, 258, 587], [63, 93, 7, 754], [258, 7, 1000, 723], [587, 754, 723, 81]]		#TC no.2


# main end!

# 풀이1
# def solution(arr):
#     answer = 0
#     for i in range(len(arr)):
#         for j in range(len(arr)):
#             print(f"arr[{i}][{j}] vs arr[{j}][{i}]", arr[i][j],"vs", arr[j][i])
#             if arr[i][j] != arr[j][i]:
#                 answer = 0
#                 break
#             else:
#                 answer = 1
#         break # 안쪽 for문 break 후 바깥쪽 for문 까지 break 해주는 것이 point!
    
#     return answer


# 풀이2
def solution(arr):
    
    for i in range(len(arr)):
        for j in range(len(arr)):
            if arr[i][j] != arr[j][i]:
                return 0
    return 1  
            


print(solution(arr)) 