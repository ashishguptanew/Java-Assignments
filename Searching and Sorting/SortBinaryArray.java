package arraySortingSearching;

import java.util.Scanner;

public class SortBinaryArray {

	//n = 7
	//arr= 0,1,1,0,1,0,1
	
	//o/t=0,0,0,1,1,1,1
	
	
	//Time= O(n) space = O(1)
	private static void sortBinaryArray(int[] arr) {
		int count = 0;//intialize count variable
		for(int i = 0; i < arr.length; i++) {//traversing ith to arr,length
			if(arr[i] == 0) //check arr[i == o then increase count
				count++;
			}
		for(int i = 0; i < count; i++) {//it means ith to count we'll print 0
			arr[i] = 0;
		}
		for(int i = count; i < arr.length; i++) {//it means that count to arr.length we'll print 1
			arr[i] = 1;
		}
	}
	
	//	//Time= O(n) space = O(1)
//	private static void sortBinaryArray(int[] arr) {
//		int ptr = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] == 0) {
//				int temp = arr[ptr];
//				arr[ptr] = arr[i];
//				//System.out.println(arr[ptr]+" "+arr[i]);
//				arr[i] = temp;
//				//System.out.println(arr[i]+" "+temp);
//				ptr++;
//				//System.out.println(ptr);
//			}
//		}
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	static Scanner S = new Scanner(System.in);

	public static int[] takeInput() {	
		int size = S.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = S.nextInt();
		}
		return arr;
	}

	public static void printArray(int[] arr) {	
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

	
	public static void main(String[] args) {
		int[] arr = takeInput();
		sortBinaryArray(arr);
		printArray(arr);
	}

	
}
