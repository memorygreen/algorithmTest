# 260324

# main start!

arr = [1, 2, 3, 4, 5]		#TC no.1
intervals = [[1, 3], [0, 4]]		#TC no.1


# main end!

# def solution(arr, intervals):
#     answer = 0
#     arr1 = arr[intervals[0][0]:intervals[0][1]+1]
#     arr2 = arr[intervals[1][0]:intervals[1][1]+1]
#     answer = arr1+arr2
#     return answer


def solution(arr, intervals):
    a,b = intervals[0]
    c,d = intervals[1]
    
    return arr[a:b+1]+arr[c:d+1]
    
print(solution(arr, intervals)) 