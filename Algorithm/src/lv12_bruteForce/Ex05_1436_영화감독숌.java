package lv12_bruteForce;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05_1436_영화감독숌 {

	public static void main(String[] args) {
		// 240407 일
		Scanner sc = new Scanner(System.in);
		//System.out.print("숫자를 입력하세요 : ");
		int N = sc.nextInt();
		
		ArrayList<String> list666 = new ArrayList<String>();
		
		int cnt = 0;
		while(list666.size() <= 10000) {
			
			cnt++;
			String string_cnt = cnt + "";
			if(string_cnt.contains("666")) {
				
				list666.add(string_cnt);
				//System.out.println(string_cnt);
				
			}
		}
		
		System.out.println(list666.get(N-1));
		
		
	}

}
