package Patterns;

import java.util.Scanner;

public class SquarePattern {
//	4444
//	4444
//	4444
//	4444
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <=n; j++) {
				System.out.print(n);
			}
			System.out.println();
		}
	}
	
	
	
}
