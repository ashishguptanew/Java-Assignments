package ConditionalandLoops;

import java.util.Scanner;

public class FahrenheitToCelsiusTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		int w = sc.nextInt();
		
		double celsius;
		while(s <= e) {
			celsius = (s - 32)/1.8;//to measure temp and 1.8 (9/5)
			System.out.println(s + "\t" +(int)celsius);
			s = s + w;
		}
	}
}
