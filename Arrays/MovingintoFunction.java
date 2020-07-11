package array;

import java.util.Scanner;
public class MovingintoFunction {
	
	public static void printArray(int[] arr) {
		int n = arr.length;//it was used to take/know input n//it is used to know the size of the array
				for(int i = 0; i < n; i++) {
					System.out.println(arr [i]);
				}		
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
		int [] arr = takeInput();
		printArray(arr);
	}
}
