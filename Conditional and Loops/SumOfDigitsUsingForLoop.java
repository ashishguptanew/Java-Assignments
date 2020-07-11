package ConditionalandLoops;

import java.util.Scanner;

public class SumOfDigitsUsingForLoop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum;
		int temp = n;
		
		for(sum = 0; temp > 0; temp /= 10) {//Initialization , condition, increment value to be check
			sum += temp % 10;//sum + modular 10 value of temp
		}
		System.out.println("Sum of the digits " + n + " is " + sum);
	}
}
