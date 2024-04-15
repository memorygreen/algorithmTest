package lv03_iteration;

import java.util.Scanner;

public class Ex11_10952_AplusBminus5 {

	public static void main(String[] args) {
		// 240218 일

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A==0 & B==0) {
				break;
			}
			System.out.println(A+B);
		}
		
		
	}

}
