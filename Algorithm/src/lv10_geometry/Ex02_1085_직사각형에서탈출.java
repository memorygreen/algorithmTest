package lv10_geometry;

import java.util.Scanner;

public class Ex02_1085_직사각형에서탈출 {

	public static void main(String[] args) {
		
		// 240310  일
		//6 2
		// 10 3
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		
		int result = 0;
		
		// 0에서 세로
		int garo = 0; 
		if(x-0 > w-x) {
			garo = w-x;
		}else {
			garo = x-0;
			
		}
		
		int sero = 0;
		if (y-0 > h-y) {
			sero = h-y;
		}else {
			sero = y-0;
		}
		
		if(sero > garo) {
			result = garo;
		}else {
			result = sero;
		}
		
		
		
		System.out.println(result);
		
	}

}
