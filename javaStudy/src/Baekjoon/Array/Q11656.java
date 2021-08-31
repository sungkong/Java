package Baekjoon.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q11656 {
public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		String[] arr = new String[s.length()];
		for(int i=0; i<arr.length; i++) {
			arr[i] = s.substring(i,arr.length);
		}
		Arrays.sort(arr);
		for(String a : arr) {
			System.out.println(a);
		}
	}
}
