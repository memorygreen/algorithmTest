package lv09_divisor_multiple_primeNumber;

import java.io.BufferedWriter;
import java.util.Scanner;

public class Ex02_2501_약수구하기 {

	public static void main(String[] args) {
		// 240415 월
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(); //next가 아닌 nextLine을 써야한다!
		String[] str = s.split(" ", -1);
		
//		System.out.println(str[0]); //확인용
//		System.out.println(str[1]); // 확인용
		int N = Integer.parseInt(str[0]);
		int K = Integer.parseInt(str[1]);
		
		int cnt_factor = 0; //약수의 개수 세기
		for(int i=1; i<=N;i++) {
			if(N % i == 0) {
				cnt_factor++;
			}
			
		}
//		System.out.println("약수의 개수 : " + cnt_factor); //N의 약수개수 확인용
		
		
		int cnt = 0; //K번째 약수 세기
		for(int i=1; i<=N;i++) {
			if(cnt_factor < K) {
				System.out.println(0);
				break;
			}
			if(N % i == 0) {
				cnt++;
			}
			if(cnt ==K) {
				System.out.println(i);
				break;
			}
			
			
		}
	}

}
