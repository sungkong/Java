package Algorithm;

import java.util.Scanner;

public class LinearSearchSentry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); // 요소 수
		int[] arr = new int[num+1];
		
		System.out.println("배열 입력");
		for(int i = 0; i< num; i++) {
			arr[i] = sc.nextInt();
		}
		
		int key = sc.nextInt(); // 찾는 숫자
		int ans = sentry(arr, num, key);
        if(ans == -1) System.out.println("요소가 존재하지 않습니다.");
        else System.out.println(key+"는 " + "arr[" + ans +"]에 있습니다.");
		
	}
	
	static int sentry(int[] arr, int num, int key) {
		int i=0;
		arr[num] = key;
		
		while(true) {
			if(arr[i] == key) break;
			i++;
		}
		return i == num? -1 : i;
	}
}
