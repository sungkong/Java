package String;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10820 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>(); // 출력결과 저장
		while(sc.hasNextLine()) {
			int upperCount = 0;
			int lowerCount = 0;
			int digitCount = 0;
			int spaceCount = 0;
			
			String input = sc.nextLine();
			if(input == null || input.equals("")) { 
				break;
			} // 공백입력시 스캐너 종료
			for(int i=0; i<input.length(); i++) {
				char word = input.charAt(i);
				if(Character.isUpperCase(word)==true) {
					upperCount++;
				} else if(Character.isLowerCase(word)==true) {
					lowerCount++;
				} else if(Character.isDigit(word)==true) {
					digitCount++;
				} else {
					spaceCount++;
				}
			}
			list.add(lowerCount+" "+upperCount+" "+digitCount+" "+spaceCount);
		}
		sc.close();
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
}