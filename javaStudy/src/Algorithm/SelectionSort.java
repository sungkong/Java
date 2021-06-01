package Algorithm;

public class SelectionSort {
	public static void main(String[] args) {
		int min, temp;
		int arr[] = {5,33,4,11,6,54};
		for (int i=0; i<arr.length-1;i++) {
			min = i;
			for(int j=i+1; j<arr.length; j++){
				if(arr[min]>arr[j]) {
					min = j;
				}
			}
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
		for(int data : arr) {
			System.out.println(data);
		}
	}
}
