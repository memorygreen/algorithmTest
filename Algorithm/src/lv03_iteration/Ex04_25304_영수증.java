package lv03_iteration;

import java.util.Scanner;

public class Ex04_25304_영수증 {

	public static void main(String[] args) {
		//240218

		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int N = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i<=N;i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			sum = sum + a*b;
		}

		if(sum == X) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
