package lv04_array1;

import java.util.Scanner;

public class Ex08_3052_나머지_미완 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		// 나머지가 들어있는 배열(10개)
		for (int i =0; i<arr.length;i++) {
			int num = sc.nextInt();
			arr[i] = num % 42;
			
		}
		
		// 나머지의 종류 수 세기
		if(arr[0]!=arr[1]) {
			System.out.println("0번과"+"1"+"번 같지 않음");
		}else if(arr[0]==arr[1]) {
			System.out.println("0번과"+"1"+"번 같음");
		}
		
		if(arr[0]!=arr[2]) {
			System.out.println("0번과"+"2"+"번 같지 않음");
			
		}else if(arr[0]==arr[1]) {
			System.out.println("0번과"+"2"+"번 같음");
		}
		
		
		
			
		
		int kind = arr[0];//기준
		
		int cnt = 1; // 종류 개수  
		
		
//		for (int i =0; i<arr.length;i++) {
//			if(arr[i]==kind) {
//				
//				System.out.println("이전과 같음");
//			}else if(arr[i] != kind) {
//				kind = arr[i];
//				System.out.println("종류 개수 추가");
//				cnt++;
//			}
//			
//		}
		System.out.println(cnt);
		


	}

}
