package array;

import java.util.Scanner;

public class TripletSum {
	//N= 7
	//arr= 1,2,3,4,5,6,7
	//x = 12
	
//	Output=
//			1 4 7
//			1 5 6
//			2 3 7
//			2 4 6
//			3 4 5
	

	

	private static void tripletSum(int[] arr, int x) {
		java.util.Arrays.sort(arr);//it would be helpful to sort the array if arrays are not sorted
		for(int i = 0;i < arr.length - 2; i++) {
			for(int j = i + 1; j < arr.length - 1; j++) {
				for(int k = j + 1; k < arr.length; k++) {
					if(arr[i] + arr[j] + arr[k] == x) {
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					}
				}
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	static Scanner S = new Scanner(System.in);

	public static int[] takeInput() {	
		int size = S.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = S.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		int x = S.nextInt();

		tripletSum(arr, x);
	}


	
}
