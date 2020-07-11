package ConditionalandLoops;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 2; i < n; i++) {//excl 2 & number itself
			System.out.println(i + " " + n);
			if(n % i == 0) {
				System.out.println(i + " ");//it will provide factors only when it gives no remainder
			}
		}
	}
}
