package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1152 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);	
		String input = sc.nextLine();
		String a = "";
		ArrayList<String> arr1 = new ArrayList<>();
		String[] arr = input.split(" ");
		for(int i =0; i<arr.length; i++) {
			arr1.add(arr[i]);
			if(arr[i].equals(a)) {
				arr1.remove(arr[i]);
			}
		}
		System.out.println(arr1.size());
		
		/*
		 * public static void main(String[] args) throws IOException {
		 * 
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * StringTokenizer st = new StringTokenizer(br.readLine()," ");
		 * 
		 * int count = st.countTokens(); System.out.print(count); }
		 */	
	}
}
