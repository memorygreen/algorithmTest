package lv11_timeComplexity;

import java.util.Scanner;

public class Ex04_24265알고리즘의수행시간4 {

	public static void main(String[] args) {
		//240310 일
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("번호를 쓰세요");
		long n = sc.nextInt();
		
		
		long sum = 0;
//		for(int i= 1; i<= n - 1;i++) {
//	    	for(int j = i + 1;j<= n;j++) {
//	    		sum++;
//	    		
//	    	}
//		}
		
		for( int i = 1 ; i<=n-1;i++) {
			sum = sum+i;
		}
		
		System.out.println(sum);
		System.out.println(2);
		
		
		
		
		
	}


	
}
