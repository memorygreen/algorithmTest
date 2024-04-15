package lv02_condition;

import java.util.Scanner;

public class Ex01_1330_두수비교하기 {

	public static void main(String[] args) {
		// 240218 일

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A > B ) {
			System.out.println(">");
		}else if(A < B) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
		
		
	}

}
