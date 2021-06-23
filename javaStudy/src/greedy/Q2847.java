package greedy;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2847
public class Q2847 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int count = 0;
		for(int i=n-1; i>0; i--) {
			if(arr[i]<=arr[i-1]) {
				count += (arr[i-1]-arr[i]+1);
				arr[i-1] = arr[i]-1;
			} 
		}
		System.out.println(count);
	}
}

