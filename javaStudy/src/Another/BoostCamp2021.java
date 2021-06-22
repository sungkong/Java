package Another;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/*자연수가 들어있는 배열 arr안의 숫자들 중에서 앞에 있는 숫자들부터 뒤에 중복되어 나타나는 숫자들 중복 횟수를
계산해서 배열로 return. 중복되는 숫자가 없다면 -1 출력*/
public class BoostCamp2021{
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        
        //계산하기 쉽게 먼저 정렬을 했다.
        Arrays.sort(arr);
        ArrayList<Integer> count = new ArrayList<>();
        
		/*
		 * 오름차순으로 정렬된 배열에서 카운팅. 검사하면서 다른 숫자가 나타나면 그 인덱스를 기준으로 j-i로 계산함 그리고 i = j부터 다시 검사
		 * 시작. 마지막 숫자의 검사가 끝나면 반복문을 벗어난다
		 */
        loop:
        for(int i=0; i<arr.length; i++) {
        	for(int j=i+1; j<arr.length; j++) {
        		if(arr[i] != arr[j]) {
        			count.add(j-i);
        			i = j;
        		} else if(arr[i] == arr[j] && j == arr.length-1) {
        			count.add(j-i+1);
        			break loop;
        		}
        	} 
        }
        
		/*
		 * Araaylist.removeAll(Collection<?> c) [객체를 리스트에서 삭제한다.] 1을 갖고 있는 객체 리스트 one을
		 * 생성해서 count가 1인(중복이 없는)값을 삭제.
		 */
        ArrayList<Integer> one = new ArrayList<>();
        one.add(1);
        count.removeAll(one);
        if(count.size() > 0) {
        	for(int i=0; i<count.size(); i++) {
        		System.out.print(count.get(i)+ " ");
        	}
        } else {
        	System.out.print(-1);
        }
        
    }
}
