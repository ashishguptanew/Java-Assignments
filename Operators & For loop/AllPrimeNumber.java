package ForLoop;

import java.util.Scanner;

public class AllPrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i = 2; i <= n; i++) {
			boolean isPrime = true;//initialize as true
			for(int j = 2; j < i; j++) {//it always check with j = 2 
					if(i % j == 0) {//it check i % j == 0 e.g 4 % 2 == 0 then return false;
						isPrime = false;
						break;//it takes out of the for loop and didn't try to increase j's value less than i and 
						//it directly jumps to next ith number i++
					}
			}
			if(isPrime) {
				System.out.println(i);
			}
		}
	}
}
