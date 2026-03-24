

# main start!

myString = "AbCdEfG"		#TC no.1
pat = "aBc"		#TC no.1
#myString = "aaAA"		#TC no.2
#pat = "aaaaa"		#TC no.2

# main end!

def solution(myString, pat):
    answer = 0
    if pat.upper() in myString.upper():
        answer=1
    else:
        answer = 0
    return answer

print(solution(myString, pat)) 
