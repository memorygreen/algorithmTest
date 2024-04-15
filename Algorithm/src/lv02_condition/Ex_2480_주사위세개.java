package lv02_condition;

import java.util.Scanner;

public class Ex_2480_주사위세개 {

	public static void main(String[] args) {
		// 240218 일

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2= sc.nextInt();
		int n3 = sc.nextInt();
		
		//주사위 3개
		if((n1 == n2) & (n2 == n3) & (n1==n3)) {
			System.out.println(10000 + n1 * 1000);
		}else if(n1 == n2 & n2 !=n3) {
			System.out.println(1000 + n1*100);
		}else if (n1== n3 & n1 != n2) {
			System.out.println(1000 + n1*100);
		}else if (n2==n3 & n1 != n2) {
			System.out.println(1000 + n2*100);
	
		}else if(n1 != n2 & n2 != n3 & n1 != n3) {
			int max = n1;
			max = (max < n2) ? n2 : max;
			max = (max < n3) ? n3 : max;
			System.out.println(max *100);
			
		}

	}
}