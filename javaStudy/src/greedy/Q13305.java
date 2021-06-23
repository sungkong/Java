package greedy;

import java.util.Scanner;

public class Q13305 {
// https://www.acmicpc.net/problem/13305
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] len = new int[n-1];
		int[] oil = new int[n];
		int sum = 0;
		
		for(int i=0; i<n-1; i++) {
			len[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			oil[i] = sc.nextInt();
		}
		int minOil = oil[0];
		
		for(int i=0; i<n-1; i++) {
			if(oil[i] < minOil) {
				minOil = oil[i];
			}
			sum += minOil*len[i];
		}
		
		System.out.println(sum);
		
		
	}
}