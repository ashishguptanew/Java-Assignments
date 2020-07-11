package Patterns;

public class InterestingAlphabets {

//	E
//	DE
//	CDE
//	BCDE
//	ABCDE

	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; i++) {
			char ithChar = (char) ('A' + n - i);
			for(int j = 1; j <= i; j++) {
				System.out.print(ithChar);
				ithChar = (char) (ithChar + 1);
			}
			System.out.println();
		}
	}
}
