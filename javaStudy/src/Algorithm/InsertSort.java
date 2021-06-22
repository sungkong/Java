package Algorithm;

import java.util.Arrays;

public class InsertSort{
	
	public static void main(String[] args) {

	// 두 번째 인덱스부터 시작.
	// 현재 인덱스 이전 인덱스와 비교해서 정렬.
	int[] arr = {4,5,4,9,10,1};
	for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j>0; j--) {
			if(arr[j] < arr[j-1]) {
				int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
			}
		}
	}
	System.out.println(Arrays.toString(arr));

	}	
}
