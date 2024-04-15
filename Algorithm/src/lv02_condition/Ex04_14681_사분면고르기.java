package lv02_condition;

import java.util.Scanner;

public class Ex04_14681_사분면고르기 {

	public static void main(String[] args) {
		// 240218 일

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x>0 & y>0) {
			System.out.println(1);
		}else if (x>0 & y<0) {
			System.out.println(4);
		}else if (x<0 & y>0) {
			System.out.println(2);
		}else if (x<0 & y<0) {
			System.out.println(3);
		}
		
		
	}

}
