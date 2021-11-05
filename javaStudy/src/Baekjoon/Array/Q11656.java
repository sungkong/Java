package Baekjoon.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q11656 {
public static void main(String args[]) throws IOException {
		
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		// 문자열의 모든 접미사를 담을 배열
		String[] arr = new String[s.length()];
		// 처음 인덱스부터 마지막 인덱스까지 문자열을 추출해서 배열에 담기.
		for(int i=0; i<arr.length; i++) {
			arr[i] = s.substring(i,arr.length);
		}
		// 사전순으로 정렬해주는 함수;
		Arrays.sort(arr);
		for(String a : arr) {
			System.out.println(a);
		}
	}
}
