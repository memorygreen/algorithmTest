package lv02_condition;

import java.util.Scanner;

public class Ex02_9498_시험성적 {

	public static void main(String[] args) {
		// 240218 일

		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score <= 100 & score >= 90) {
			System.out.println("A");
		}else if (score >= 80) {
			System.out.println("B");
		}else if (score >= 70) {
			System.out.println("C");
		}else if (score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
	}

}
