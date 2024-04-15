package lv02_condition;

import java.util.Scanner;

public class Ex06_2525_오븐시계_re {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int hour = A + (C / 60); //시(걸린시)
		int min = B + (C % 60); //분
		
		
		if (min >= 60) {
			hour = hour+1;
			min = min-60;
			
		}
		
		if (hour >=24) {
			hour = hour -24;
		}
		
		System.out.print(hour+ " ");
		System.out.println(min);
		
		
		
	}

}
