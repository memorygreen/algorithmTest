package lv03_iteration;

import java.util.Scanner;

public class Ex01_2739_구구단 {

	public static void main(String[] args) {
		//240218

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 1; i<=9;i++) {
			System.out.printf("%d * %d = %d\n",N,i,N*i);
		}
		
		
	}

}
