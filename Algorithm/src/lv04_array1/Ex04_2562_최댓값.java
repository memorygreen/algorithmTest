package lv04_array1;

import java.util.Scanner;

public class Ex04_2562_최댓값 {

	public static void main(String[] args) {
		// 240218 일

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		
		for(int i = 0 ; i <arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		//최대 값 구하기
		int max = arr[0];
		int index = 0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]> max) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println(max);
		System.out.println(index+1);
		
		
		sc.close();
		
	}

}
