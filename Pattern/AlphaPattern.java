package Patterns;

public class AlphaPattern {

	public static void main(String[] args) {
//		A
//		BB
//		CCC
		int n = 3;
		for(int i = 1; i <= n; i++) {
			char ithChar = (char) ('A' + i - 1);
			for(int j = 1; j <= i; j++) {
				System.out.print(ithChar);
			}
			System.out.println();
		}
	}
}
