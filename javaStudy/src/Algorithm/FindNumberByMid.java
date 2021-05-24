package Algorithm;

import java.util.Scanner;

public class FindNumberByMid {
	public static void findNumberByMid(){
	System.out.println("최소 범위 : ");
	Scanner sc = new Scanner(System.in);		
	int min = sc.nextInt();

	System.out.println("최대 범위 : ");		
	int max = sc.nextInt();

	System.out.println("찾을 숫자 : ");		
	int num = sc.nextInt();
	
	int count = 0;		
	int mid = (min+max)/2;
	
	while(true){
	if(num == mid) {
		count++;
		System.out.println(count + "번 만에 찾음");
		break;
	} else if (num < mid) {
		count++;
		max = mid;
		mid = (min+max)/2;
	} else {
		count++;
		min = mid;
		mid = (min+max)/2;
		}
	}
  }
}
