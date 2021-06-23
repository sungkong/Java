package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q10610 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		String num = sc.nextLine();
		String[] number = num.split("");
		
		int numCount[] = new int[10]; // 숫자 배열
		int total = 0; // 자릿수 총합
		
		int[] arr = new int[num.length()]; // 입력된 숫자 분리
		for(int i=0; i<num.length(); i++){
			arr[i] = Integer.parseInt(number[i]);
			numCount[arr[i]]++;
			total += arr[i];
		}
		// 0이 하나도 없거나, 모든 자릿수를 더한 값이 3으로 안나눠지면 30의 배수가 안됨.
		if(!num.contains("0") || total%3 != 0){
			System.out.print(-1);
			return;
		}
		
		StringBuilder sb = new StringBuilder();
        for(int i = 9; i >= 0; i--) {
            while(numCount[i] > 0) {
                sb.append(i);
                numCount[i]--;
            }
        }
        System.out.println(sb.toString());
		
		
	}
}