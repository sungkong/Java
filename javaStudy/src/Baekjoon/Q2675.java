package Baekjoon;

import java.util.Scanner;

public class Q2675 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);	
		int testCase = sc.nextInt();
		
		
		
		for(int i = 0; i<testCase; i++) {
			int n = sc.nextInt();
			String text = sc.next();
			String arr[] = text.split("");		
			for(int j = 0; j<arr.length; j++) {
				for(int k = 0; k<n; k++) {
					System.out.print(arr[j]);
				}
			}
			System.out.println();
		}
		
	}
}
