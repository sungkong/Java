package Baekjoon;

import java.util.Scanner;

public class Q1157 {
public static void main(String args[]) {
		
		int cnt[] = new int[26];
		Scanner sc = new Scanner(System.in);	
		String input = sc.next();
		
		String UpperInput = input.toUpperCase();
		for(int i = 0; i< UpperInput.length();i++) {
			char index = UpperInput.charAt(i);
			cnt[index -'A']++;			
		}
		int max = 0;
		int maxIndex = 0;
		boolean dup = false;
		for(int i = 0; i<26; i++) {
			if(cnt[i]>max) {
				max = cnt[i];
				maxIndex = i;
				dup = false;
			} else if(cnt[i] == max) dup = true;
		}
		if(dup) System.out.print("?");
		else System.out.print((char)(65+maxIndex));
		
		
		
		
	}
}
