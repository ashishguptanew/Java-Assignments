package array;

import java.util.Scanner;
//
//Sample Input 1:
//3
//9 8 9
//Sample Output 1:
//26

public class ReturnArraySum {

		public static int sum (int[] input){
			int sum = 0; 
	        		for(int i = 0; i < input.length; i++) {
	                    sum += input [i];
			
					}
					return sum;	

		}
		
	
	
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
	
		int[] input = takeInput();
		
		sum(input);
		
	}

}
