package lv03_iteration;

import java.util.Scanner;

public class Ex09_2438_별찍기1 {

	public static void main(String[] args) {
		//240218

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		
		for(int i = 1;i<=N;i++) {
			
			for(int j = 1 ; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
				
		
		
	}

}
