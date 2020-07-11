package Patterns;

import java.util.Scanner;

public class SumPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum = sum + i;
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
				if(j == i) {
					System.out.print("=");
				}else {
					System.out.print("+");
				}
			}
			System.out.println(sum);
		}
	}
}
