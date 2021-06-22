package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Q1181{
	
    public static void main(String[] args) throws IOException {
    	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] arr = new String[n];
    
    for(int i=0; i<n; i++) arr[i] = br.readLine();
    Arrays.sort(arr, new Comparator<String>() {
    	
    	@Override
    	public int compare(String s1, String s2) {
    		if(s1.length() == s2.length()) {
    			return s1.compareTo(s2); // compareTo : 사전순으로 정렬
    		} else {
    			return s1.length() - s2.length(); //양수면 교환
    		}
    	}
    });
    System.out.println(arr[0]);
    // 중복되는 경우 한 번만 출력
    for(int i=1; i<arr.length; i++) {
    	if(!arr[i].equals(arr[i-1])) {
    		System.out.println(arr[i]);
    	}
    }
    }
}