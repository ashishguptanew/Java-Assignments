package Patterns;

import java.util.Scanner;

public class ParallelogramPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int spaces = i - 1; spaces >= 1; spaces --) {
				System.out.print(" ");
			}
			for(int stars = 1; stars <= n; stars++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
