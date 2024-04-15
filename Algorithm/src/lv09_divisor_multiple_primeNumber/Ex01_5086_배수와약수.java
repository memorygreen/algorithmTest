package lv09_divisor_multiple_primeNumber;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex01_5086_배수와약수 {

	public static void main(String[] args) throws IOException {
		
		// 240415 월
		
//		Scanner sc = new Scanner(System.in); // StringTokenizer 는 버퍼로만 가능하군!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		while(true) {
			
			String line = br.readLine(); //NoSuchElementException 방지
			StringTokenizer st = new StringTokenizer(line);
			
			if(line == null) {
				break;
			}
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			// 종료
			if(A==0 && B==0) {
				break;
			}
			
			//약수 판별
			if(B % A == 0) {
				bw.write("factor");
				bw.newLine();
//				System.out.println("factor");
			}else if(A % B ==0){
				bw.write("multiple");
				bw.newLine();
//				System.out.println("multiple");
			}else {
				bw.write("neither");
				bw.newLine();
//				System.out.println("neither");
			}
			
		}
		
		bw.flush();
		br.close();
		bw.close();
		
		
	}

}
