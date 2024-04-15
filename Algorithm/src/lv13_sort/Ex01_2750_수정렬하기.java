package lv13_sort;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01_2750_수정렬하기 {

	public static void main(String[] args) {
		//240414 일
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //숫자 개수
		
		
		int[] num_list = new int[N];
		
		// 입력
		for(int i = 0 ; i<N ; i++) {
			num_list[i] = sc.nextInt();
			
		}
		
		// 정렬		
		Arrays.sort(num_list);
		
		
		// 출력
		for(int i = 0 ; i<N ; i++) {
			System.out.println(num_list[i]);
			
		}
		
		
		
		
	}

}
