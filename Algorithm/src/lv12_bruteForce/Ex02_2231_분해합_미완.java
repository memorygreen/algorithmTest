package lv12_bruteForce;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex02_2231_분해합_미완 {

	public static void main(String[] args) {
		//240407 일
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요:");
		int N = sc.nextInt();
		

		int con = 0;//constructor
		
		int num=0;
		
		
		for(int i = 1 ; i <= N ; i++) {
			
			int num1 = i % 10;
			num = num - num1;
			System.out.println(num);
			
			int num10 = i / 10 ;
			System.out.println(num10);
			num = num - num10;
			System.out.println(num);
			
			int num100 = i % 10;
			
			
			
			
			
		}
		
		// while
//		int cnt = 1;
//		boolean ck = false; 
//		while(ck == false) {
//		
//			int num100 = cnt / 100;
//			int num10 = cnt / 10 %10;
//			int num1 = cnt % 10 ;
//			if(num100 + num10+ num1 + cnt == N) {
//				ck = true;
//				System.out.println(cnt);
//				break;
//			}
//			cnt++;
//		}
		
		
		
		
	}

}
