package Patterns;

public class CharacterPattern {
//	A
//	BC
//	CDE
//	DEFG
	public static void main(String[] args) {
		int n = 4;
		for(int i = 1; i <= n; i++) {
			char ithChar = (char) ('A' + i - 1);
			for(int j = 1; j <= i; j++) {
				System.out.print(ithChar);
				ithChar = (char) (ithChar + 1);
			}
			System.out.println();
		}
	}
}
