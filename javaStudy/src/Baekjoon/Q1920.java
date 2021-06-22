package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q1920{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		//이분탐색의 필수조건 : 정렬
		Arrays.sort(arr);
		
		int m = sc.nextInt();
		for(int i=0; i<m; i++) {
			int num = sc.nextInt();
			int left = 0;
			int right = n-1;
			boolean flag = false;
			while(right>=left) {
				int midIndex = (left+right)/2;
				int midValue = arr[midIndex];
				if(midValue > num) {
					right = midIndex - 1;
				} else if(midValue < num) {
					left = midIndex + 1;
				} else {
					flag = true;
					System.out.println(1);
					break;
				}
			}
			if(!flag) {
				System.out.println(0);
			}
		}
	}
}