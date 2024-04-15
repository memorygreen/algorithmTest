package lv04_array1;

import java.util.Scanner;

public class Ex03_10818_최소최대 {

	public static void main(String[] args) {
		// 240218 일

		Scanner sc = new Scanner(System.in);
		
//		System.out.print("배열 데이터 개수 입력>>");
		int N = sc.nextInt();
		
		//배열 선언(공간 생성)
		int[] arr = new int[N];
		
		//배열 입력
//		System.out.print("배열 값 추가>>");
		for(int i = 0; i<N ; i++) {
			arr[i]=sc.nextInt();
		}
		
		
		//최대 구하기
		int min=1000000;
		for(int i=0; i<N;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.print(min + " ");
				
		//최소 구하기
		int max= (-1)*1000000;
		for(int i=0; i<N;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
		
	}

}
