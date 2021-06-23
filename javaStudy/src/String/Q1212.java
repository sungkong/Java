package String;

import java.io.IOException;
import java.util.Scanner;

public class Q1212 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<input.length(); i++) {
			//한 글자에서 '0'을 뺴서 10진수로 바꿔준 후 2진수로 변환해준다.
			String num = Integer.toBinaryString(input.charAt(i)-'0');
			// 맨 앞을 제외한 나머지 인덱스에 0을 붙이는 로직.
			if(num.length()==2 && i != 0) {
				num = "0"+ num;
			} else if(num.length()==1 && i != 0) {
				num = "00"+num;
			}
			
			sb.append(num);
		}
		
		System.out.println(sb);
		
		
		
	}
}