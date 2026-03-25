

# main start!

num_list = [3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1]		#TC no.1
#num_list = [2, 3, 4, 5]		#TC no.2


# main end!

def solution(num_list):
    mul=1
    if len(num_list)>=11 :
        return sum(num_list)
    else:
        for i in range(len(num_list)):
            mul *= num_list[i]
        return mul

print(solution(num_list)) 
    