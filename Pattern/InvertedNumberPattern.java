package Patterns;

public class InvertedNumberPattern {
//
//	4444
//	333
//	22
//	1
	public static void main(String[] args) {
		int n = 4;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i + 1; j++) {
				System.out.print(n - i + 1);
			}
			System.out.println();
		}
	}
}
