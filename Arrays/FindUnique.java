package array;

import java.util.Scanner;
//
//Sample Input 1:
//7
//2 3 1 6 3 6 2
//Sample Output 1:
//1

public class FindUnique {
	
//	O(n)
	private static int findUnique(int[] arr) {
		int result = 0;
		for(int i = 0; i < arr.length; i++) {
			result = result ^ arr[i];
		}
		return result;
	}
	
	//O(n2)
//	private static int findUnique(int[] arr) {
//		for(int i = 0; i < arr.length; i++) {
//			int j;
//			for(j = 0; j < arr.length; j++) {
//				if(i != j && arr[i] == arr[j]) {
//					break;
//				}
//			}
//			if(j == arr.length) {
//				return arr[i];
//			}
//		}
//		return Integer.MAX_VALUE;
//	}
	
	
	
	
	
	
	
	
	
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.print(findUnique(arr));
	}

	
}
