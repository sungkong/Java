package String;

import java.util.Scanner;

public class Q11720 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s;
		// 숫자의 개수와 문자열긔 길이가 일치한지 확인하는 로직. 일치할 때 까지 루프
		while(true) {
			s = sc.next();
			if(n == s.length()) break;
		}
		
		int sum = 0; // 숫자의 합을 담을 변수
		//문자열의 첫 번째 자리부터 하나씩 추출해서 -'0'으로 정수형태로 만들고 sum에 더해준다.
		for(int k=0; k<s.length(); k++) {
			sum += s.charAt(k)-'0';
		}
		System.out.println(sum);
		
	}
}
