package ConditionalandLoops;

import java.util.Scanner;

public class PalindromeNumberUsingForLoops {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int temp = n;
		int reverseNumber;
		
		for(reverseNumber = 0; temp > 0; temp /= 10) {
			reverseNumber = reverseNumber * 10 + temp % 10;
		}
		
		if(reverseNumber == n) {
			System.out.println(n + " is a palindrome number");
		}else {
			System.out.println(n + " is not a palindrome number");
		}
	}
}
