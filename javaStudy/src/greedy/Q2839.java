package greedy;

import java.util.Scanner;

public class Q2839 {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
        
		int N = in.nextInt();
		
		
		if (N == 4 || N == 7) {
			System.out.println(-1);
		}
		else if (N % 5 == 0) {
			System.out.println(N / 5);
		}
		else if (N % 5 == 1 || N % 5 == 3) {
			System.out.println((N / 5) + 1);
		}
		else if (N % 5 == 2 || N % 5 == 4) {
			System.out.println((N / 5) + 2);
		}
		
		/* int result = 0;
		int nam = 0;
		int n = sc.nextInt();
			
		result = n/5;
		nam = n%5;
		while(true) {
			if(nam%3 == 0) {
				result = result + nam/3;
				break;
			} else {		
				
				result = result - 1;
				if(result <= 0 ) {
					result = n/3;
					if(n%3 != 0) {
						result = -1;
					}
					break;
				}
				
				nam = nam + 5;
				
			}
		}
			
		
		System.out.println(result); */
	}
}