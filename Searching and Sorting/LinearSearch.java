package arraySortingSearching;

import java.util.Scanner;

//Sample Input 1:
//7
//2 13 4 1 3 6 28
//3
//Sample Output 1:
//4

public class LinearSearch {

	public static int linearSearch(int arr[], int num) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) 
				return i;
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	static Scanner s = new Scanner(System.in);
    public static int[] takeInput(){
		
		int n = s.nextInt();
		int[] input = new int[n];
		for(int i = 0; i < n; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = takeInput();
		int val = s.nextInt();		
		System.out.println(linearSearch(input,val));
	}
}
