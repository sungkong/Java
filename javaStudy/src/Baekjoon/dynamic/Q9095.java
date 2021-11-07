package Baekjoon.dynamic;

import java.util.Scanner;

public class Q9095 {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[11];
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for(int i=4; i<=10; i++) {
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
		for(int k=0; k<n; k++) {
			int m = sc.nextInt();
			System.out.println(dp[m]);
		}
		
		
	}
}


