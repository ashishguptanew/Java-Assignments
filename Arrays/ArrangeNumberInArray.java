package array;

import java.util.Scanner;
//
//Sample Input 1 :
//6
//Sample Output 1 :
// 1 3 5 6 4 2
// 
 
public class ArrangeNumberInArray {

	public static void arrange(int[] arr, int n) {
		int left = 0;
		int right = n - 1;
		int counter = 1;
		
		while(left <= right) {
			if(counter % 2 == 1) {
				//System.out.println("*");
				arr[left] = counter;
				counter++;
				left++;
				//System.out.println(arr[left]+" " +counter+ " " +left);
			}else {
				//System.out.println("#");
				arr[right] = counter;
				counter++;
				right--;
				//System.out.println(arr[right]+" " +counter+ " " +right);
			}
		}
	}
	static Scanner S = new Scanner(System.in);

	public static void printArray(int[] arr) {
		
		for(int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = S.nextInt();
		int[] arr = new int[n];

		arrange(arr, n);
		printArray(arr);

	}
}
