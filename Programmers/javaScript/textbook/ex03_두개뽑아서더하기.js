// https://school.programmers.co.kr/learn/courses/30/lessons/68644

` 제약조건 
- numbers의 길이는 2이상 100 이하
- numbers의 모든 수는 0 이상 100 이하
=> 최대 데이터 개수 100 => 시간 복잡도 고려x
`



function solution(numbers){
    
    result = [] // 배열 선언 및 초기화

    // 🕐 이중 for문 -> 시간 복잡도 O(N2)
    for(let i = 0; i<numbers.length; i++){
        for(let j = i+1; j<numbers.length; j++){
        
        result.push(numbers[i] + numbers[j]); // push() 메서드 통해 배열에 추가(python 의 append 함수와 동일 기능)
        // console.log("numbers[i] ", numbers[i])
        // console.log("numbers[j] : ", numbers[j])
        // console.log("result 결과 : ", result)
        }

    }
    uniqueArr = [...new Set(result)] // 더한 값들을 담은 배열의 중복값을 제거
    //🕐 중복 제거: O(n^2)

    var answer = uniqueArr.sort((a,b)=>a-b); // 결과 배열을 오름차순 정렬 
    // 🕐 정렬 -> 최악의 경우 uniqueArr의 길이는 n(n-1)/2가 될 수 있으므로 정렬의 시간 복잡도는 O(n^2 log n)
    return answer;
}


// main start!

// numbers = [2,1,3,4,1];		// TC no.1
numbers = [5,0,2,7];		// TC no.2
console.log(solution(numbers)) 

// main end!
