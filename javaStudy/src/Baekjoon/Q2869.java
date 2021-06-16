package Baekjoon;

import java.util.Scanner;

public class Q2869 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);	
		long A, B, V;
		A = sc.nextLong(); // 달팽이 낮에 움직이는 거리
		B = sc.nextLong(); // 미끄러지는 거리
		V = sc.nextLong(); // 막대기 높이
		
		
		System.out.print((V-A)/(A-B)+1);

	}
}
