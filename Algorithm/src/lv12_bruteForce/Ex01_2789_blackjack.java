package lv12_bruteForce;

import java.util.Scanner;

public class Ex01_2789_blackjack {

	public static void main(String[] args) {
		// 240301 금


		Scanner sc = new Scanner(System.in);
		
		System.out.println("카드 개수 입력>>");
		int N = sc.nextInt(); // 카드의 개수
		
		//블랙잭 수
		System.out.println("블랙잭 수 >>");
		int M = sc.nextInt();
		//입력한 카드를 담을 배열
		int[] card_list = new int[N];
		

		// 카드 수 입력 받기
		for (int i=0;i<N ; i++) {
//			System.out.println("카드 입력"); //임시
			int num = sc.nextInt();
			card_list[i] = num; 
		}
		
		//ex. N=5
		//ex. 0 1 2 3 4
		
		
		// 합 
		int sum = 0;
		
		// 3개 넣을 것
		int[] card3 = new int[3];
				
		for(int i=0; i<N-2;i++) {
			// 1번째 카드
//			System.out.println();
			for(int j=i+1;j<N-2+1;j++) {
				// 2번째 카드
//				System.out.println();
				for(int k=j+1;k<N-2+1+1;k++) {
					//3번째 카드
					card3[0] = card_list[i];
					card3[1] = card_list[j];
					
					card3[2] = card_list[k];
					
//					System.out.printf("카드1:%d, 카드2:%d,카드3:%d %n",card3[0],card3[1],card3[2]);//검사
//					sum < card3[0]+card3[1]+card3[2] ?sum = card3[0]+card3[1]+card3[2]:sum = sum;
					
					if(sum < card3[0]+card3[1]+card3[2] && sum <= M) {
						sum = card3[0]+card3[1]+card3[2];
						
					}
					
				}
			}
		}						
		System.out.println(sum);
		
		
	}
}