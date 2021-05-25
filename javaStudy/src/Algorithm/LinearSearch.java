package Algorithm;

import java.util.Scanner;

public class LinearSearch {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,20};
		int size = arr.length;
		System.out.println("key 입력 : ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		
		int answer = seqSearch(arr, size, key);
		
		if(answer == -1) {
			System.out.println("못찾겠다 꾀꼬리");
		} else {
			System.out.println("인덱스 : "+answer);
			System.out.println("값 : "+arr[answer]);
			
		}
		
	}
	
	static int seqSearch(int[] arr, int num, int key) {
		int i = 0;
		while(true) {
			if(arr[i] == key) return i;
			if(i == num) return -1;
			i++;
		}
	}
}
