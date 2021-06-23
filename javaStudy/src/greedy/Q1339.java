package greedy;

import java.util.Arrays;
import java.util.Scanner;
 
public class Q1339{
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        
        for(int i = 0; i < n; i++) {
        	arr[i] = sc.next();
        }
        int[] num = new int[26];
//        자릿수 만큼 가중치 부여
        for(int i = 0; i < n; i++) {
        	String t = arr[i];
        	for(int j=0; j<t.length(); j++) {
        		num[(t.charAt(j)-65)] += (int)Math.pow(10, (t.length()-j-1));
        	}
        }
        
        Arrays.sort(num);
        int result = 0;
        for(int i=25,k=9;i>=0;i--,k--) {
        	if(num[i]==0) break;
        	result += (num[i]*k);
        }
        System.out.println(result);
        
        
        
    }
}