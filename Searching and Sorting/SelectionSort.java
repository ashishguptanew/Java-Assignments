package arraySortingSearching;

public class SelectionSort {
	
//	public static void printArray(int [] arr) {
//		int n = arr.length;
//		for(int i = 0; i<n; i++) {
//			System.out.println(arr [i]);
//		}
//	}

//	public static void selectionSort(int[]arr) {
//		int n = arr.length;
//		for(int i= 0; i<n-1; i++) {
//			//insert element at ith position
//			int min = Integer.MAX_VALUE;
//			int minIndex = 1;
//			for(int j=i; j < n; j++) {
//				//finding the minimum element among j positions 
//				if(arr [j] < min) {
//					min = arr[j];
//					minIndex = j;
//				}
//			}
//			//swap element at minIndex with ith element
//			int temp = arr[minIndex];
//			arr[minIndex] = arr[i];
//			arr[i] = temp; 
//		}
//	}
	//It has more compression
	public static void selectionSort(int arr[]) {
		int n = arr.length;
		for(int i = 0; i < n - 1; i++) {
			int midIndex = i;
			for(int j = i; j < n; j++) {
				if(arr[j] < arr[midIndex]) {
					midIndex = j;
				}
			}
				int temp = arr[i];
				arr[i] = arr[midIndex];
				arr[midIndex] = temp;
		}
	 
	for(int ele: arr) {
		System.out.print(ele+" ");
	}
	}
	
	public static void main(String[] args) {
		
		int arr [] = {1,6,4,8,0,3};
		selectionSort(arr);
		//printArray(arr);
	}
}
