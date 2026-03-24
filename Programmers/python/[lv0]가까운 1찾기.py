

# main start!

arr = [0, 0, 0, 1]		#TC no.1
idx = 1		#TC no.1
#arr = [1, 0, 0, 1, 0, 0]		#TC no.2
#idx = 4		#TC no.2
#arr = [1, 1, 1, 1, 0]		#TC no.3
#idx = 3		#TC no.3

# main end!

def solution(arr, idx):
    answer = 0
    for i in range(idx,len(arr)):
        if arr[i] == 1:
            answer = 1
            break
        else:
            answer=-1
    
    return answer

print(solution(arr, idx)) 
