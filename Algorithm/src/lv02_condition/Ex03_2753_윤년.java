package lv02_condition;

import java.util.Scanner;

public class Ex03_2753_윤년 {

	public static void main(String[] args) {
		// 240218 일

		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if ((year % 4 == 0) & (year % 100 != 0) | (year % 400 ==0)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
	}

}
