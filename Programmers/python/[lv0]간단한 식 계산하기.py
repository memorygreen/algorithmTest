# 260324
# main start!

binomial = "43 + 12"		#TC no.1
#binomial = "0 - 7777"		#TC no.2
#binomial = "40000 * 40000"		#TC no.3

# main end!

# sol1) split()의 결과를 배열로 받아주기
# def solution(binomial):
#     answer = 0
#     split_arr = binomial.split(" ")
#     n1 = int(split_arr[0])
#     n2 = int(split_arr[2])
#     if split_arr[1] == "+":
#         answer = n1 + n2
#     elif split_arr[1] == "-":
#         answer = n1 - n2
#     elif split_arr[1] == "*":
#         answer = n1 * n2
    
#     return answer

def solution(binomial):
    answer = 0
    a,op,b = binomial.split()
    a = int(a)
    b = int(b)
    if op == "+":
        answer = a+b
    elif op == "-":
        answer = a-b
    elif op == "*":
        answer = a*b
        
    return answer
print(solution(binomial)) 
