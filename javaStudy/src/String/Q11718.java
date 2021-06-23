package String;

import java.util.ArrayList;
import java.util.Scanner;

public class Q11718 {
	public static void main(String[] args) {
		ArrayList<String> inputs = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		// boolean hasNextLine() = 스캐너의 입력에 다른 행이 있는 경우 true 반환
		while(sc.hasNextLine()) {
			String input = sc.nextLine();
			if(input == null || input.isEmpty()) {
				break;
			}
			inputs.add(input);
		}
		// 파일 내용을 읽은 후 스캐너를 닫는 것이 좋다. 사용하지 않는 입출력 스트림이 열리지 않도록 하기 위해
		sc.close();
		
		for(int i=0; i<inputs.size(); i++) {
			System.out.println(inputs.get(i));
		}
	}
}
