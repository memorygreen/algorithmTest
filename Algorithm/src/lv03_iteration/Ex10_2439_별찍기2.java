package lv03_iteration;

import java.util.Scanner;

public class Ex10_2439_별찍기2 {

	public static void main(String[] args) {
		//240218

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
////		N==5
////		6-1=5 공백 / 1 *
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print("*");
//		
//		for(int i=0;i<=N-1;i++) {
//			System.out.print(" ");
//		}
//		for(int i=0;i<=1-1;i++) {
//			System.out.print("*");
//		}
//		
//		//공백 4 , * 2
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print("*");
//		System.out.print("*");
//		
//		for(int i=0;i<=N-2;i++) {
//			System.out.print(" ");
//		}
//		for(int i=0;i<=2-1;i++) {
//			System.out.print("*");
//		}
//		
//		
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		
//		for(int i=0;i<=N-3;i++) {
//			System.out.print(" ");
//		}
//		for(int i=0;i<=3-1;i++) {
//			System.out.print("*");
//		}
//		
//		
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		
//		for(int i=0;i<=N-4;i++) {
//			System.out.print(" ");
//		}
//		for(int i=0;i<=4-1;i++) {
//			System.out.print("*");
//		}
//		
//		System.out.print(" ");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		
//		for(int i=0;i<=N-5;i++) {
//			System.out.print(" ");
//		}
//		for(int i=0;i<=5-1;i++) {
//			System.out.print("*");
//		}			
//		
//		
//		
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		
//		
//		for(int i=0;i<=N-6;i++) {
//			System.out.print(" ");
//		}
//		for(int i=0;i<=6-1;i++) {
//			System.out.print("*");
//		}	
		
		// 다 합치기
		for(int i = 0;i<=N;i++) {
			
			for(int j=0;j<=N-(i+1);j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=(i+1)-1;j++) {
				System.out.print("*");
			}	
			System.out.println();
		}
		
		
	}

}
