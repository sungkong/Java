package Algorithm;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {3,5,2,55,6,1,17};
		int temp;
		
		for(int i = 0; i < arr.length-1; i++)  {
			for(int j = 0; j < arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;					
				}				
			}
		}	
		
		for(int number : arr) {
			System.out.print(number+" ");						
		}
	}
}
