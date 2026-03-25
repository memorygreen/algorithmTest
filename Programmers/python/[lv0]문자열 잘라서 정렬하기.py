

# main start!

myString = "axbxcxdx"		#TC no.1
#myString = "dxccxbbbxaaaa"		#TC no.2

# main end!

def solution(myString):
    # answer = sorted(
    answer = sorted(myString.replace("x", " ").split())
    # strip().split("x")

    return answer

print(solution(myString)) 
