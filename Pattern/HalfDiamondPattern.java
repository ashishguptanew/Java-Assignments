package Patterns;

import java.util.Scanner;

public class HalfDiamondPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		System.out.println("*");
		
		//FHALF
		for(int i = 1; i <= n; i++) {
			System.out.print("*");
			for(int num1 = 1; num1 <= i; num1++) {
				System.out.print(num1);
			}
			for(int num2 = i - 1; num2 >= 1; num2--) {
				System.out.print(num2);
			}
			System.out.println("*");
		}
		//SHALF
		for(int i = 1; i <= n - 1; i++) {
			System.out.print("*");
			for(int num1 = 1; num1 <= n - i; num1++) {
				System.out.print(num1);
			}
			for(int num2 = n - i - 1; num2 >= 1; num2--) {
				System.out.print(num2);
			}
			System.out.println("*");
		}
		System.out.print("*");
	}
}
