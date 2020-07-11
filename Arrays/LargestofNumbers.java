package array;

import java.util.Scanner;

public class LargestofNumbers {
	
	public static int largest(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int [] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] arr = new int [n];
			for(int i = 0; i < n; i++) {
				System.out.println("Enter the element at " + i + "th index");
				arr [i] =s.nextInt();
			}
			return arr;
	}

	public static void main(String[] args) {
		
		int[] arr = takeInput();
		int lar = largest(arr);
		System.out.println(lar);//largest value in the array
		System.out.println(arr);//ans=[I@3b9a45b3//references of array
	}
}
