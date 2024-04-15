package lv02_condition;

import java.util.Scanner;

public class Ex05_2884_알람시계 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		
		if (min-45 < 0) {
			hour = hour-1;
			min = 60+(min-45);
			
			if(hour < 0) {
				hour = 23;
			}
			
			System.out.print(hour +" ");
			System.out.println(min);
			
		}else {
			min = min - 45;
			System.out.print(hour +" ");
			System.out.println(min);
		}
		
		
	}

}
