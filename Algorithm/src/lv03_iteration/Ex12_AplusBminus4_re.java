package lv03_iteration;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex12_AplusBminus4_re {

	public static void main(String[] args) throws IOException{
		//240415 월 re
		//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		//입력은 여러 개의 테스트 케이스로 이루어져 있다.
		//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		while(true) {
			String line = br.readLine();
			
			if(line == null) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(line);
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			
			if(A==0 && B==10) {
				break;
			}
			
			
		bw.write(A+B+"");
		bw.newLine();
		
		}

		
		bw.flush();
		br.close();
		bw.close();

		
		
	}

}
