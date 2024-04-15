package lv03_iteration;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex06_15552_빠른AplusB {

	public static void main(String[] args) throws IOException {
		
		//240415 월
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T =  Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i<T ; i++) {
			String AB = br.readLine();
			StringTokenizer st = new StringTokenizer(AB);
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			bw.write((A + B) +"");
			bw.newLine();
			
		}
		
		bw.flush();
		br.close();
		bw.close();
		
		
		
		
		
		
	}

}
