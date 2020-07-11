package ForLoop;

import java.util.Scanner;

public class PrimeNumbers {//it's a multiple of 1 and number itself

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		boolean isPrime = true; //default boolean variable as true defined
		
		//for(int i = 2; i < n; i++) {//starts with 2 as prime number starts with 2 number
		for(int i = 2; i * i <= n; i++) {//it provide a less time complexity 
								//1 < Factor < n under root //if factor isn't under root then it is a prime no
			if(n % i == 0) {
				isPrime = false;
				break;//it moves out of the loop and executes the next statement after the loop
			}	
		}
		if(n < 2) isPrime = false;//to handle less than two value and give output as false
		System.out.println(isPrime);
	}
}
