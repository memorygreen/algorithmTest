package lv10_geometry;

import java.util.Scanner;

public class Ex07_5073_삼각형과세변 {

	public static void main(String[] args) {
 
		// 240311 월
		Scanner sc = new Scanner(System.in);

		int[] list = new int[3];

		while (true) {

			// list에 넣기
			for (int i = 0; i < list.length; i++) {

				list[i] = sc.nextInt();
				
				// for문 종료
				if (list[0] == 0 && list[1] == 0 && list[2] == 0) {
					break;
				}
			}

			// 정렬(오름차순)
			int temp = 0;
			for (int j = 1; j < list.length; j++) {
				if (list[j] < list[j-1]) {
					temp = list[j-1];
					list[j-1]=list[j];
					list[j]=temp;
					
				}
			}
			
			
			//list 확인
//			System.out.print("list");
//			for(int j=0;j<list.length;j++) {
//				System.out.print(list[j] +" ");
//			}
//			System.out.println();
			

			// 삼각형 판단
			if (list[2]>=list[0]+list[1]) {
				System.out.println("Invalid");

			} else if (list[0] == list[1] && list[0] == list[2] && list[1] == list[2]) {
				System.out.println("Equilateral");
			} else if (list[0] == list[1] || list[0] == list[2] || list[1] == list[2]) {
				System.out.println("Isosceles");
			} else if (list[0] != list[1] || list[0] != list[2] || list[1] != list[2]) {
				System.out.println("Scalene");
			}

			// while문 종료
			if (list[0] == 0 && list[1] == 0 && list[2] == 0) {
				break;
			}
		}

	}

}
