package lv11_timeComplexity;

import java.util.Scanner;

public class Ex07_24313점근적표기1 {

	public static void main(String[] args) {
		//240310 일
		Scanner sc = new Scanner(System.in);

		int a1 = sc.nextInt();
		int a0 = sc.nextInt();
		int c = sc.nextInt();
		int n = sc.nextInt();

		int result = 3;
		
		
		for(int i =n;i<=100;i++) {
			
			if ((a1 - c) * i + a0 <= 0) {
				result = 1;
				//System.out.println("n="+i+"일 때 result : "+ result);
			} else {
				result = 0;
				//System.out.println("n="+i+"일 때 result : "+ result);
				break;
			}
			
		}


		System.out.println(result);

	}

}
