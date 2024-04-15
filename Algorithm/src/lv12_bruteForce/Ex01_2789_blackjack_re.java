package lv12_bruteForce;

import java.util.Scanner;

public class Ex01_2789_blackjack_re {

	public static void main(String[] args) {
		// 240301 금
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //카드의 개수
		int M = sc.nextInt(); // 블랙잭
		
		int[] card = new int[N];// 카드 입력
		for(int i = 0; i<N ;i++) {
			card[i] = sc.nextInt();
		}
		
		//비교 (N=5)
		// 0 1 2 3 4 
		// 0 1 2
		// 0 1 3
		// 0 1 4 
		// 0 2 3
		// 0 2 4
		// 0 3 4
		
		// 1 2 3
		// 1 2 4
		// 1 3 4 ///////
		
		// 2 3 4
		
		int sum = 0;//임시합
		int max = 0; //최대
		for(int i = 0;i<N-2;i++) {
			for(int j = i+1;j<N-2+1;j++) {
				for(int k=j+1;k<N-2+1+1;k++) {
					sum = card[i]+card[j]+card[k];
					// 조건1) M(21) 보다 같거나 작아야함
					// 조건2) M에 가까운 수를 출력해야함(작거나 같은 수 중 최대)
					if(sum <= M && sum > max) {
						max = sum; 
					}
				}
			}
		}
		System.out.println(max);
		
		
	}

}
