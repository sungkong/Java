package Baekjoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q2581 {
//https://www.acmicpc.net/problem/2581 소수
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=n; i<=m; i++) {
			boolean flag = true;
			for(int j=2; j<i; j++) {
				
				if(i%j == 0) {
					flag = false;
					break;
				}
				
			}
			if((flag == true) && (i != 1)) {
				sum += i;
				list.add(i);
			}
		}
		if(list.size()==0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(list.get(0));
		} 
	}
}
