package greedy;

import java.util.Arrays;
import java.util.Scanner;
 
public class Q2217{
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int w = 0;
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int max =0;
        
        for(int i =n-1; i>=0; i--) {
         	w = arr[i] * (n-i);
        	if(max < w) max = w;
        }
        System.out.print(max);
        
        /* Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		for(int i=0; i<n; i++) {
			int tmp = arr[i] * (n-i);
			if(sum < tmp) {
				sum = tmp;
			}
		}
		System.out.println(sum); */
    }
}