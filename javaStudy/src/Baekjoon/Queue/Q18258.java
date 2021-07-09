package Baekjoon.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/18258
public class Q18258 {

	static int[] queue = new int[2000000];
	static int front = 0;
	static int back = 0;
	static int size = 0;
	
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		Q18258 q = new Q18258();
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			switch(st.nextToken()){
			case "push": q.push(Integer.parseInt(st.nextToken())); break;
			case "pop" : q.pop(); break;
			case "size" : q.size(); break;
			case "empty" : q.empty(); break;
			case "front" : q.front(); break;
			case "back" : q.back(); break;
		}
	}
		System.out.println(sb);
}
	
	void push(int item) {
		queue[back] = item;
		back++;
		size++;
		}
	
	void pop() {
		if(size == 0) {
			sb.append("-1").append("\n");
		} else {
			sb.append(queue[front]).append("\n");
			size--;
			front++;
		}
	}
		
	void size() {
		sb.append(size).append("\n");
	}
	
	void empty() {
		if(size == 0) {
			sb.append(1).append("\n");
		} else {
			sb.append(0).append("\n");
		}
	}
	
	void front() {
		if(size == 0) {
			sb.append(-1).append("\n");
		} else {
			sb.append(queue[front]).append("\n");
		}
	}
	
	void back() {
		if(size == 0) {
			sb.append(-1).append("\n");
		} else {
			sb.append(queue[back-1]).append("\n");
		}
	}
}
