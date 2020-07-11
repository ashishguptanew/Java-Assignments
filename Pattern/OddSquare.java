package Patterns;

import java.util.Scanner;

public class OddSquare {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i = 1; i < 2*n; i+=2) {
			for(int num1 = i; num1 < 2*n; num1+=2) {
				System.out.print(num1);
			}
			for(int num2 = 1; num2 < i; num2+=2) {
				System.out.print(num2);
			}
			System.out.println();
		}
	}
}
