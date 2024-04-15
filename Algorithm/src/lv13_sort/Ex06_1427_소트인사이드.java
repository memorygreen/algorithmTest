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

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex06_1427_소트인사이드 {

	public static void main(String[] args) throws IOException {
		// 240414 일
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 덕근 힌트
		Integer num = Integer.parseInt(br.readLine());
		
		
		List<Integer> num_list = new ArrayList<Integer>(); // 숫자 넣을 배열
		
		
		// 반복
		
		
		while(num != 0) {
			
			Integer num1 = num % 10; //1의 자리
			num_list.add(num1);
			//bw.write(num1);
//			System.out.println("1의 자리 " + num1);
			num = (num -num1) / 10 ;
//			System.out.println("1의자리 빼고 10으로 나누기 " + num);
		}

		// 정렬
		Collections.sort(num_list, Collections.reverseOrder());
		
		
		// 확인
		for(int i = 0 ; i< num_list.size(); i++) {
//			bw.write(num_list.get(i));
			System.out.print(num_list.get(i));
		}
		
		
		
		
		
		//		// 반복
//		System.out.println("2트");
//		System.out.println("1의 자리 " + num % 10);
//		num = (num - num % 10) / 10 ;
//		System.out.println("1의자리 빼고 10으로 나누기 " + num);
//				
//		// 반복
//		System.out.println("3트");
//		System.out.println("1의 자리 " + num % 10);
//		num = (num - num % 10) / 10 ;
//		System.out.println("1의자리 빼고 10으로 나누기 " + num);
//						
//		// 반복
//		System.out.println("4트");
//		System.out.println("1의 자리 " + num % 10);
//		num = (num - num % 10) / 10 ;
//		System.out.println("1의자리 빼고 10으로 나누기 " + num);
//					
		
		
		
		br.close();
	    bw.flush();
	    bw.close();
		
		
		
		//자영 1트
		// 입력받기
//		String[] str_list = br.readLine().split("");
//		
		// 숫자배열 공간 만들기
//		int[] num_list  = new int[ str_list.length];
//		
//		// 숫자 배열에 값 변환하여 넣기
//		for (int i = 0 ; i < str_list.length; i++) {
//			num_list[i] = Integer.parseInt(str_list[i]);
//			// 확인(임시)
////			bw.write(num_list[i]);
//			System.out.print(num_list[i]);
//		}
		
		
		// 정렬
		
	
		
		
		
		
		
		
		
		
	}

}
