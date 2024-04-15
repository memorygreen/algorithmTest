package lv03_iteration;

import java.util.Scanner;

public class Ex03_8393_합 {

	public static void main(String[] args) {
		//240218

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		for (int i = 1;i <= n ;i++) {
			sum = sum+i;
		}
		
		System.out.println(sum);
		
		
	}

}
