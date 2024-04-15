package lv09_divisor_multiple_primeNumber;

import java.util.Scanner;

public class Ex03_9506_약수의합 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 240415 월
		while(true) {
			int n =  sc.nextInt(); // 숫자 입력
			
			
			int sum=0; //자기자신 제외한 약수들의 합
			String str = ""+n;
			// 완전수 판별
			for(int i=1;i<=n-1;i++) {
				
				if(n % i ==0) {
					sum = sum + i;
//					str = ((Object)n).toString() +" + "+ ((Object)i).toString();
					str = str + " + "+ i + " + ";
				}
				System.out.println(str);
				
				
				
				
			}
			
			
			
			
			// 종료
			if(n ==-1) {
				break;
			}
		}

	}

}
