package Test1;

public class NumberStarPattern {

	public static void main(String[] args) {
//		5432*
//		543*1
//		54*21
//		5*321
//		*4321
		int n = 5;
		for(int i = 1; i <= n; i++) {
			for(int num1 = n; num1 > i; num1--) {
				System.out.print(num1);
			}
			for(int star = i; star <= i; star++) {
				System.out.print("*");
			}
			for(int num2 = i - 1; num2 > 0; num2--) {
				System.out.print(num2);
			}
			System.out.println();
		}
	}
}
