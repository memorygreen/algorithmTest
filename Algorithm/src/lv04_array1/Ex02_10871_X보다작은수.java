package lv04_array1;

import java.util.Scanner;

public class Ex02_10871_X보다작은수 {

	public static void main(String[] args) {
		// 240218 일

		Scanner sc = new Scanner(System.in);
		
//		System.out.print("정수를 입력하세요>>");
		int N = sc.nextInt();
		
		//N개의 값을 가지는 배열 선언
		int[] A = new int[N];
		
//		System.out.print("정수를 입력하세요>>");
		int X = sc.nextInt();
		
//		System.out.print("배열을 추가하세요>>");
		
		for(int i= 0 ; i < N;i++) {
			int add =sc.nextInt();
			A[i] = add;
		}
		
		//X보다 작은 수 출력하기
		for(int i=0 ; i < N ; i++) {
			if (A[i] < X){
				System.out.print(A[i] + " ");
			}
		}
		
	}

}
