package Patterns;

import java.util.Scanner;

public class TriangleNumberPattern {

	public static void main(String[] args) {
//   int n = 4;
//		1
//		22
//		333
//		4444
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
