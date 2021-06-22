package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q10814{
	
    public static void main(String[] args) throws IOException {
    	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    String[][] arr = new String[n][2];
    
    for(int i=0; i<n; i++) {
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    	arr[i][0] = st.nextToken();
    	arr[i][1] = st.nextToken();
    }
    Arrays.sort(arr, new Comparator<String[]>() {
    	
    	@Override
    	public int compare(String[] s1, String[] s2) {
    		return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
    	}
    });
    
    
    for(int i=0; i<arr.length; i++) {
    	System.out.println(arr[i][0] + " "+ arr[i][1]);
    }
    }
}