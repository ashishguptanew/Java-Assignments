package Patterns;

public class TriangleofNumbers {

	public static void main(String[] args) {
//		    1
//		   232
//		  34543
//		 4567654
		int n = 4;
		for(int i = 1; i <= n; i++) {
			for(int spaces = 1; spaces <= n - i; spaces++) {
				System.out.print(" ");
			}
			for(int num1 = 1; num1 <= i; num1++) {
				
				System.out.print(num1 + i - 1);
			}
			for(int num2 = i - 1; num2 >= 1; num2--) {
				System.out.print(num2 + i - 1);
			}
			System.out.println();
		}
	}
}
