package lv02_condition;

import java.util.Scanner;

public class Ex06_2525_오븐시계 {

	public static void main(String[] args) {
		// 시작시각
		// 오븐구이 필요 시간 분단위
		// =>끝나는 시각 구하라
		
		//1) 현재시각 A시(0~23 정수) B분(0~59 정수)
		
		//2) 필요시간 C분(0~1000분 정수)
		
		
		//정리
		//B+C 60분이 안됐다 그대로
		
		//B+C 60분이 넘었다 
		//=>A 1올라가 
		//=>B =B+C-60
		
		
		
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if (B + C >= 60) {
			A = A + 1;
			System.out.print(A + " ");
			B = B+C-60;
			if (B == 60) {
				A += 1;
				B = 0;
				System.out.println(B);
				
			}
		}else if (B + C >= 120){
			A = A + 2;
			System.out.print(A + " ");
			B = 0;
			System.out.println(B);
		}else {
			System.out.print(A + " ");
			B = B + C;
			System.out.println(B);
			
		}
		
	
		
	}

}
