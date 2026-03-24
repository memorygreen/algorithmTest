

# main start!

strArr = ["AAA","BBB","CCC","DDD"]		#TC no.1
#strArr = ["aBc","AbC"]		#TC no.2

# main end!

def solution(strArr):
    answer = []
    for i in range(len(strArr)):
        # 홀수번째
        if i % 2 == 1 :
            answer.append(strArr[i].upper())
        else:
            answer.append(strArr[i].lower())
            
    return answer

print(solution(strArr)) 
