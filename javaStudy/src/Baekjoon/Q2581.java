package Baekjoon;

import java.util.Scanner;

public class Q2581 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);	
		int M, N;
		M = sc.nextInt();
		N = sc.nextInt();
		int sum = 0;
		int min = 0;
		boolean first = false;
		for(int i = M;i<=N;i++) {
			if (i == 1) continue;
			boolean sosu = true;
			for(int j = 2; j < i; j++) {			
				if(i % j == 0) {
					sosu = false;
					break;
				}
			}
				if(sosu) {
					if(first == false) {
						min = i;
						first = true;
					}
					sum += i;
				}
		}
		if(sum == 0) System.out.print(-1);
		else {
			System.out.println(sum);
			System.out.print(min);
		}
		
	}
}
