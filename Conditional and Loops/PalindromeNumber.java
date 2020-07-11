package ConditionalandLoops;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int temp = n;
		int reverseNumber = 0;
		
		while(temp > 0) {
			int lastDigit = temp % 10;
			reverseNumber = reverseNumber * 10 + lastDigit;//r*10+ld = 0*10+5=5
			temp /= 10;//Increment
		}
		if(reverseNumber == n) {//condition to check that n is equal to reverse number 
			System.out.println(n + " is a palindrome number");
		}else {
			System.out.println(n + " is not a palindrome number");
		}
	}
}
