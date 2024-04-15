package lv13_sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex05_10989_수정렬하기3 {

	public static void main(String[] args) throws IOException{
		//240414 일
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		// 민재씨 설명듣고 도전
		int num_list[] = new int[10001];
		
		
		int N = Integer.parseInt(br.readLine());
		
		
		// 1씩 추가(입력한 숫자)
		for(int i =0 ; i<N ; i++){
			num_list[Integer.parseInt(br.readLine())]++;
			
		}
		
		
		// 출력
		for(int i =0 ; i<num_list.length ; i++){
			
			if(num_list[i] > 0) {
				
				for(int j = 0; j <num_list[i];j++) {
//					System.out.println(i);
					bw.write(String.valueOf(i));
					bw.newLine();
					
				}
				
				bw.flush();
			}
			
			
		}
		
		
		br.close();
	    
	    bw.close();
		
		
		
		
		
		
		
		
		
		
		
		
		// 자영 1트 틀림
//		int N = Integer.parseInt(br.readLine());
//		
//		List<Integer> num_list = new ArrayList<Integer>();
//		
//		for (int i =0 ; i < N; i++) {
//			num_list.add( Integer.parseInt(br.readLine()));
//		}
//		
//		Collections.sort(num_list);
//		
//		// 출력
//		for (int i = 0 ; i< num_list.size(); i++) {
//			bw.write(Integer.toString(num_list.get(i)));
//			bw.newLine(); //개행
//			
//		}
//		

		
		
		
		
		
		
	}

}
