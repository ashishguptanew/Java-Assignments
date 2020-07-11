package ConditionalandLoops;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
//		int n = 5;
//		
//		do {
//			System.out.println("n is " + n);
//			n--;
//		}while(n != 0);
		
		Scanner s = new Scanner(System.in);
		
		int n;
		do {
			n = s.nextInt();
			System.out.println("number " + n);
		}while(n != 0);
	}
}
