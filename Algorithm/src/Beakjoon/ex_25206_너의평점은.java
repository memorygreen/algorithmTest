package Beakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class ex_25206_너의평점은 {

	public static void main(String[] args) {

		// 1) 입력받음
		// 2) split 공백 기준으로 나눔 ->리스트에 담김
		// 3) [1] * if([2])
		// if 문 A,B,C,D,F,P (P면 제외)
		// P 개수 카운트 해서 20에서 카운트를 빼주기
		// sum 변수에 담음
		// sum/20

		Scanner sc = new Scanner(System.in);
		// 전체 성적의 합 sum
		double sum = 0;
		double cnt_sub = 0; // 학점의 총합
		for (int i = 1; i <= 20; i++) {

			// 성적 입력
//			System.out.print(i + "번째 성적을 입력해주세요>>");
			String s = sc.nextLine(); // 자영아 잘쓰자 nextLine
			String[] sub = s.split(" ");

			// 성적 판단

			if (sub[2].equals("A+")) {
				double score = 4.5;
				double c = Double.parseDouble(sub[1]);
				sum = sum + c * score;
				cnt_sub += c;
			} else if (sub[2].equals("A0")) {
				double score = 4.0;
				double c = Double.parseDouble(sub[1]);
				sum = sum + c * score;
				cnt_sub += c;
			} else if (sub[2].equals("B+")) {
				double score = 3.5;
				double c = Double.parseDouble(sub[1]);
				sum = sum + c * score;
				cnt_sub += c;
			} else if (sub[2].equals("B0")) {
				double score = 3.0;
				double c = Double.parseDouble(sub[1]);
				sum = sum + c * score;
				cnt_sub += c;
			} else if (sub[2].equals("C+")) {
				double score = 2.5;
				double c = Double.parseDouble(sub[1]);
				sum = sum + c * score;
				cnt_sub += c;
			} else if (sub[2].equals("C0")) {
				double score = 2.0;
				double c = Double.parseDouble(sub[1]);
				sum = sum + c * score;
				cnt_sub += c;
			} else if (sub[2].equals("D+")) {
				double score = 1.5;
				double c = Double.parseDouble(sub[1]);
				sum = sum + c * score;
				cnt_sub += c;
			} else if (sub[2].equals("D0")) {
				double score = 1.0;
				double c = Double.parseDouble(sub[1]);
				sum = sum + c * score;
				cnt_sub += c;
			} else if (sub[2].equals("F")) {
				double score = 0.0;
				double c = Double.parseDouble(sub[1]);
				sum = sum + c * score;
				cnt_sub += c;
			}

		}

		double gpa = sum / cnt_sub;
//		
//		// 최종 학점 출력
		System.out.println(gpa);
//		

	}

}
