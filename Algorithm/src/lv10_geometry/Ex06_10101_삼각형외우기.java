package lv10_geometry;

import java.util.Scanner;

public class Ex06_10101_삼각형외우기 {

	public static void main(String[] args) {
 
		//240310 일
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt(); //acgle1
		int a2 = sc.nextInt(); //acgle2
		int a3 = sc.nextInt(); //acgle3
		
		
		if(a1==60 && a2==60 && a3==60) {
			System.out.println("Equilateral");
		}else if(a1+a2+a3==180 && ((a1==a2)||(a1==a3)||(a2==a3))) {
			System.out.println("Isosceles");
		}else if(a1+a2+a3==180 && (a1!=a2)&&(a1!=a3)&&(a2!=a3)) {
			System.out.println("Scalene");
			
		}else if(a1+a2+a3!=180) {
			System.out.println("Error");
		}
		
	}

}
