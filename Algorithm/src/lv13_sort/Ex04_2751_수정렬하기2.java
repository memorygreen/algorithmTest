package lv13_sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex04_2751_수정렬하기2 {

	public static void main(String[] args) throws IOException{
		//240414 일
		
		// 버퍼
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
//		String[] num_list = new String [N];
//		int[] num_list = new int [N];
		
		List<Integer> num_list = new ArrayList();
		
		// 수 입력
		for(int i=0 ; i < N ; i++) {
			num_list.add(Integer.parseInt(br.readLine()));
		}
		
		// 정렬
//		Arrays.sort(num_list);
		Collections.sort(num_list);
		
		
		// 출력
		for(int i=0 ; i < N ; i++) {
			
			bw.write(num_list.get(i) + "\n");
		}
         
	     br.close();
	     bw.flush();
	     bw.close();

	      
		
		
		
	}

}
