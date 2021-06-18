package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Q1789{
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int sum = 0;
        int num = 1;
        int count = 0;
        // 1부터 숫자를 계속 더하면서 합이 s보다 커지면 그 차이만큼의 수를 빼주면 되므로 -1
        while(true) {
        	sum += num;
        	num++;
        	count++;
        	if(sum > s) {
        		break;
        	}
        }
        System.out.print(count-1);
    }
}
