package arraySortingSearching;

public class BubbleSort {
	
	public static void printArray(int [] arr) {
		int n = arr.length;
		for(int i = 0; i<n; i++) {
			System.out.println(arr [i]);
		}
	}
	
	

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	//Bubble sorted using more compression
//	public static void bubbleSort(int[] arr) {
//		int n = arr.length;
//		for(int i = 0; i < n-1; i++) {
//			boolean sorted = true;
//			// n-1 round 
//			for(int j = 0; j < n-1-i; j++) {
//				if(arr[j + 1] < arr[j]) {
//					int temp = arr[j + 1];
//					arr[j + 1] = arr [j];
//					arr[j] = temp;
//					
//					sorted = false;
//				}
//			}
//			if(sorted) break;
//		}
//	}
	
//	To print the sorted array
//	for(int ele: arr) {
//		System.out.print(ele+" ");
//	}
	

	public static void main(String[] args) {
		int arr [] = {1,7,4,3,9,2,6};
		bubbleSort(arr);
		printArray(arr);

	}
}
