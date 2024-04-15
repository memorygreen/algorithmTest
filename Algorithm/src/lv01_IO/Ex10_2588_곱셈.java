package lv01_IO;

import java.util.Scanner;

public class Ex10_2588_곱셈 {

	public static void main(String[] args) {
		// 240218 일

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		
		//(1)
		System.out.println(num1 * (num2 % 10));
		
		//(2)
		System.out.println(num1* (num2 % 100 / 10));
		
		//(3)
		System.out.println(num1*(num2 / 100));
		
		//(4)
		System.out.println(num1 * (num2 % 10) + num1* (num2 % 100 / 10) *10 + num1*(num2 / 100) *100);
	}

}
