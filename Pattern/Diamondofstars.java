package Patterns;

import java.util.Scanner;

public class Diamondofstars {
		//    *
		//  * * *
		//* * * * *
		//  * * *
		//    *
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int fhalf = (n+1) /2;
		int shalf = n / 2 ;
		//First Half
		for(int i = 1; i <= fhalf; i++) {
			for(int spaces1 = 1; spaces1 <= (fhalf - i); spaces1++) {
				System.out.print(" ");
			}
			for(int star = 1; star <= (2 * i) - 1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//Second Half
		for(int i = shalf; i >= 1; i--) {
			for(int spaces = 1; spaces <= fhalf - i; spaces++) {
				System.out.print(" ");
			}
			for(int star = 1; star <= (2 * i) - 1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
