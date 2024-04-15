package lv03_iteration;

import java.util.Scanner;

public class Ex10_2439_별찍기2_re {

	public static void main(String[] args) {
		//240218
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		// 합치기(이중 for문)
		for(int i = 1;i<=N;i++) {
			
			for(int j=1;j<=N-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=N-(N-i);j++) {
				System.out.print("*");
			}System.out.println();
			
		}
		
		
	}

}
