package ConditionalandLoops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int sum = 0;
		int temp = n;
		
		while(temp > 0) {
			int lastDigit = temp % 10;
			temp /= 10;//when it becomes zero stop...
			
			System.out.println(lastDigit + " " + temp + " " + sum);
			sum += lastDigit;//sum will includes and add lastDigit 
		}
		System.out.println("Sum of digits "+ n + " is " + sum);
	}
}
