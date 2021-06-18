package greedy;

import java.util.Arrays;
import java.util.Scanner;
 
public class Q11399{
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        
        Arrays.sort(arr);
        
       int sum = 0;
       for(int i = 0; i < arr.length; i++) {
    	   for(int j = 0; j <= i; j++) {
    		   sum += arr[j];
    	   }
       }
       System.out.print(sum);
    }
}