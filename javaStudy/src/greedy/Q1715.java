package greedy;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;


//https://www.acmicpc.net/problem/1715
public class Q1715 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PriorityQueue<Long> q = new PriorityQueue<>();
		for(int i=0; i<n; i++) {
			q.add(sc.nextLong());
		}
		
		int sum = 0;
		//앞 2개를 더한 값을 뒤에서 사용하므로, 더한 값을 큐에 계속 넣어주어야 한다.
		while(q.size() > 1) {
			long i = q.poll();
			long j = q.poll();
			
			sum += i+j;
			q.add(i+j);
		}
		System.out.println(sum);
	}
}