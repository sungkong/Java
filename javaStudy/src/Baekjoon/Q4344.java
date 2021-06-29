package Baekjoon;

import java.util.Scanner;
// https://www.acmicpc.net/problem/4344
public class Q4344 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);	
		int testCase = sc.nextInt();
		
		
		
		for(int i = 0; i<testCase; i++) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			
			double sum = 0;
			double avg = 0;
			double count = 0;
		
			for(int j = 0; j<arr.length; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
		
			avg = sum / arr.length;
		
			for(int j = 0; j<arr.length; j++) {
				if(arr[j] > avg) count++;
			}
			double result = count/arr.length;
		
			System.out.printf("%.3f%%\n", result*100);
		
		}
		
	}
}
