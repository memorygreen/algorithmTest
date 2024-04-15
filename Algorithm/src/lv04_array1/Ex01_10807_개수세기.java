package lv04_array1;

import java.util.Scanner;

public class Ex01_10807_개수세기 {

	public static void main(String[] args) {
		// 240218 일

		Scanner sc = new Scanner(System.in);
		
//		System.out.println("정수의 개수를 입력하세요");
		int N = sc.nextInt();
		
		int arr[] = new int[N];
		
//		System.out.println("정수를 추가하세요>>");
		for(int i=0;i<N;i++) {
			int add = sc.nextInt();
			arr[i] = add;
			
		}
		
//		System.out.print("찾을 정수를 입력하세요>>");
		int find = sc.nextInt();
		int cnt=0;
		for (int i=0;i<N;i++) {
			
			if (arr[i] == find) {
				cnt++;
			}
			
		}
		System.out.println(cnt);
		
	}

}
