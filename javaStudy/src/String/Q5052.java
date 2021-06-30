package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
//https://www.acmicpc.net/status?user_id=thstjddn0223&problem_id=5052&from_mine=1 
public class Q5052 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			String[] arr = new String[n];		
			for(int k=0; k<n; k++) {
				arr[k] = br.readLine();
			}
			
			Arrays.sort(arr);
		
			boolean flag = false;
			for(int k=0; k<arr.length-1; k++) {
				if(arr[k].length() < arr[k+1].length()) {
					if(arr[k+1].indexOf(arr[k]) != -1) {
						flag = true;
						break;
					}
				}
			}
			if(flag) bw.write("NO\n");
			else bw.write("YES\n");
			
		}
		br.close();	
		bw.flush();
		bw.close();
		
	}
}
