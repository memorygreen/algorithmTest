package lv02_condition;

import java.util.Scanner;

public class Ex06_2525_오븐시계_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		// 걸린 시간 60분 이상일때 
		//걸린시간(C) 150분 h시 m분 
		int hour =  C / 60; //시(걸린시)
		int min = C % 60; //분
		//C 2시간 30분
		//A 19: 
		
		
		A = A + hour;
		B = B + min;
		if(B <60) {
		
			System.out.print(A + " ");
			System.out.println(B);
			
		}
		
		else if (B >= 60) {
			A = A+1;
			B = B-60;
			
			
			if(A >= 24) {
				A = A-24;
				
			}
			System.out.print(A + " ");
			System.out.println(B);
			
		}
		
//		if(C)
		
		
	}

}
