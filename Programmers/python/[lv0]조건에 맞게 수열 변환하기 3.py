

# main start!

arr = [1, 2, 3, 100, 99, 98]		#TC no.1
k = 3		#TC no.1
#arr = [1, 2, 3, 100, 99, 98]		#TC no.2
#k = 2		#TC no.2


# main end!

def solution(arr, k):
    for i in range(len(arr)):
        if k % 2 == 1 : 
            arr[i] = arr[i] * k
        else:
            arr[i] = arr[i] + k
    return arr

arr = [1, 2, 3, 100, 99, 98]
k = 3
print(solution(arr, k)) 