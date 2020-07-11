package arraySortingSearching;

public class InsertionSort {
	
	
	
	public static void printArray(int [] arr) {
		int n = arr.length;
		for(int i = 0; i<n; i++) {
			System.out.println(arr [i]);
		}
	}
	
	
	public static void insertionSort(int[]arr){
		for(int i = 1; i < arr.length; i++) {//starts with index 1 or not with 0th index
			int temp = arr[i];
			int j = i - 1;
			while(j >=0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}
	
	public static void main(String[] args) {
		int arr [] = {1,7,4,3,9,2,6};
		insertionSort(arr);
		printArray(arr);
}
}
