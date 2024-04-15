package lv10_geometry;

import java.util.Scanner;

public class Ex03_3009_네번째점 {

	public static void main(String[] args) {
		// 240310  일
		// 네번 째 점
		
		Scanner sc = new Scanner(System.in);
		int dot1_x = sc.nextInt();
		int dot1_y = sc.nextInt();
		int dot2_x = sc.nextInt();
		int dot2_y = sc.nextInt();
		int dot3_x = sc.nextInt();
		int dot3_y = sc.nextInt();
		
		int[] x = {dot1_x, dot2_x, dot3_x};
		int[] y = {dot1_y, dot2_y, dot3_y};
		
		
		int x1 = 1000; // x1(작은 값) 찾기
		int x2 = 0; // x2(큰 값) 찾기
		int y1 = 1000; // x2(큰 값) 찾기
		int y2 = 0; // x2(큰 값) 찾기
		
		for(int i = 0 ; i <x.length;i++) {
			if(x1 > x[i]) {
				x1=x[i];
//				System.out.println(i + "번째(최소): " +x[i]);
			}
			if(x2 < x[i]) {
				x2 = x[i];
//				System.out.println(i + "번째(최대): " +x[i]);
			}
			// y 1번찾기
			if(y1 > y[i]) {
				y1=y[i];
//				System.out.println(i + "번째(최소): " +y[i]);
			}
			// y2번 찾기
			if(y2 < y[i]) {
				y2 = y[i];
//				System.out.println(i + "번째(최대): " +y[i]);
			}
		}
//		System.out.println("x1 : " + x1);
//		System.out.println("x2 : " + x2);
//		System.out.println("y1 : " + y1);
//		System.out.println("y2 : " + y1);
		
		int cnt_x2 = 0;
		int cnt_y2 = 0;
		for(int i = 0 ; i < x.length;i++) {
			if (x[i] ==x2) {//x2 횟수 세기 
				cnt_x2++;
			}
			
			if (y[i] ==y2) {//y2 횟수 세기
				cnt_y2++;
			}
			
		}
		
		int x_result = 0; //x 결과
		int y_result = 0; //y 결과
		
		if (cnt_x2 ==1) { //x 좌표 구하기(최종)
			x_result = x2;
		}else {
			x_result = x1;
		}
		
		
		if (cnt_y2 ==1) { //y 좌표 구하기(최종)
			y_result = y2;
		}else {
			y_result = y1;
		}
		
		
		System.out.print(x_result + " ");
		System.out.print(y_result);
		
	}

}
