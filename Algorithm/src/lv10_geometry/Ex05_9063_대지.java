package lv10_geometry;

import java.util.Scanner;

public class Ex05_9063_대지 {

	public static void main(String[] args) {
		//240310 일

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] x_list = new int[N];
		int[] y_list = new int[N];

		for (int i = 0; i < N; i++) {
			x_list[i] = sc.nextInt();
			y_list[i] = sc.nextInt();
		}

		int min_x = 10000;
		int max_x = -10000;
		int min_y = 10000;
		int max_y = -10000;

		for (int i = 0; i < N; i++) {
			if (x_list[i] > max_x) {
				max_x = x_list[i];
//				System.out.println("max x : " + i + "번째 : " + max_x);
			}
			if (x_list[i] < min_x) {
				min_x = x_list[i];
//				System.out.println("min x : " + i + "번째 : " + min_x);
			}

			if (y_list[i] > max_y) {
				max_y = y_list[i];
//				System.out.println("max y : " + i + "번째 : " + max_y);
			}

			if (y_list[i] < min_y) {
				min_y = y_list[i];
//				System.out.println("max y : " + i + "번째 : " + min_y);
			}
		}
		int x = max_x - min_x;
		int y = max_y - min_y;

//		System.out.println(x);
//		System.out.println(y);
		System.out.println((x*y));

	}

}
