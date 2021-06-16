package Baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q2108 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		int[] count = new int[8001]; // -4000 ~ 4000
		for(int i=0; i<n; i++) {
			arr[i]= sc.nextInt();
			sum += arr[i];
			count[arr[i]+4000]++;
		}
		int countMax = 0;
		ArrayList<Integer> maxCounting = new ArrayList<>();
		for(int i=0; i<count.length; i++) {
			if(countMax < count[i]) 
				countMax = count[i];
		}
		for(int i=0; i<count.length; i++) {
			if(countMax == count[i]) maxCounting.add(i-4000);
		}

		
		Arrays.sort(arr);
		System.out.println(Math.round((float)sum/n)); // 산술평균
		System.out.println(arr[n/2]); // 중앙값
		// 최빈값이 하나일경우, 2개 이상일 경우 
		if(maxCounting.size() == 1) {
			System.out.println(maxCounting.get(0));
		} else {
			System.out.println(maxCounting.get(1));
		}
		System.out.print(arr[n-1]-arr[0]); // 최댓값 - 최솟값
		
	}
}
