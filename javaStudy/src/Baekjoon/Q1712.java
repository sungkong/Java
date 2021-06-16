package Baekjoon;

import java.util.Scanner;

public class Q1712 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);	
		long A, B, C;
		A = sc.nextLong(); // 고정비용
		B = sc.nextLong(); // 한 대 생상하는데 필요한 총 가변비용
		C = sc.nextLong(); // 판태가격
		
//		x값 구하기
//		C*x > A+B*x , (C-B)x > A, x > A(C-B)
		
		long diff = C-B;
		if(diff <= 0) System.out.print(-1);
		else {
			System.out.print(A/diff + 1);
		}
		

	}
}
