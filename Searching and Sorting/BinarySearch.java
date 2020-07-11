package arraySortingSearching;

public class BinarySearch {
	
	public static int binarySearch(int[]arr, int num) {
		int start = 0;
		int end = arr.length - 1;
		while(start <= end) {
			int midIndex = (start + end)/2;
			if(arr[midIndex] < num) {
				start = midIndex + 1;
			}else if(arr[midIndex] > num) {
				end = midIndex - 1;
//			}else if(arr[midIndex] == num){
//				return midIndex;
//			}
				//or
			}else {
				return midIndex;
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {
		
		int arr[] = {1, 4, 7, 10, 20, 35, 40};
		int index = binarySearch(arr, 7);
		System.out.println("Index is "+ index);
	}
}
