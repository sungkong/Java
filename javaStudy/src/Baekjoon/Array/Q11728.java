package Baekjoon.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11728 {
public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int aSize = Integer.parseInt(st.nextToken());
		int bSize = Integer.parseInt(st.nextToken());
		
		int[] arr1 = new int[aSize];
		int[] arr2 = new int[bSize];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		StringBuilder sb = new StringBuilder();
		int i = 0;
		int j = 0;
		while(i < aSize && j < bSize) {
			
			if(arr1[i] < arr2[j]) {
				sb.append(arr1[i++] + " ");
			} else {
				sb.append(arr2[j++] + " ");
			} 
		}
		while(i<aSize) {
			sb.append(arr1[i++]+" ");
		}
		while(j<bSize) {
			sb.append(arr2[j++]+" ");
		}
		
		System.out.println(sb.toString());
	}
}
