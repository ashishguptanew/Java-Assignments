package array;

import java.util.Scanner;
//
//Sample Input 1:
//6
//9 3 6 12 4 32
//Sample Output 2 :
//3 9 12 6 32 4


public class SwapAlternate {
	
	
	public static void swapAlternate(int arr[]) {
		for(int i = 0; i < arr.length - 1; i+=2) {
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}
	}
	
	
	
	
	
	
	
	
	

static Scanner s = new Scanner(System.in);
	
	private static int[] takeInput(){
		
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}

	private static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = takeInput();
		swapAlternate(input);
		printArray(input);
	}
}
