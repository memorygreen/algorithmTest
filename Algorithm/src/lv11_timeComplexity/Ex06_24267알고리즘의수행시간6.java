package lv11_timeComplexity;

import java.util.Scanner;

public class Ex06_24267알고리즘의수행시간6 {

	public static void main(String[] args) {
		//240310 일
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		
		long sum1_in = 0;
		long sum2_out= 0;
		for (int i=1;i<=n-2; i++) {
			sum1_in = sum1_in + i;
			sum2_out = sum2_out + sum1_in;
		}
		System.out.println(sum2_out);
		System.out.println(3);
		
	}

}
