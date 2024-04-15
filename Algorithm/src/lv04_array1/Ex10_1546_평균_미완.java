package lv04_array1;

import java.util.Scanner;

public class Ex10_1546_평균_미완 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //과목 개수 입력
		double[] sub = new double[N]; //과목 점수 담을 배열 선언
		
		for(int i = 0 ; i <sub.length; i++) { // 배열에 점수 입력하여 담음
			sub[i] = sc.nextInt();
//			System.out.println(sub[i]);
		}
		
		double max = sub[0]; //최고점수 담을 변수 선언(임의로 첫번째 값 담음)
		
		for(int i= 0; i <sub.length ; i++) {
			if(sub[i] > max) {
				max = sub[i];
//				System.out.println("최대값: " + max);
			}
			
		}
		
		double [] sub_new = new double [N]; // 새로운 점수를 담을 배열 선언 
		for(int i= 0; i <sub.length ; i++) {
			sub_new[i] = (sub[i]/max) * 100;
//			System.out.println("새점수" + i + "번째:" +sub_new[i]);
		}
		
		
		double sum = 0;// 새로운 점수 합 담을 변수 선언
		//새로운 점수의 평균 구하기
		for(int i =0 ;i<sub_new.length;i++) {
			sum = sum + sub_new[i];
		}
		
		System.out.println(sum/(double) N);
		
		
		
		
	}

}
