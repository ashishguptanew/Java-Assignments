package Test1;

public class ZeroStarPattern {

	public static void main(String[] args) {
		int n = 4;
		for(int i = 1; i <= n; i++) {
			for(int zero1 = i -1; zero1 > 0; zero1--) {
				System.out.print("0");
			}
			for(int star1 = i; star1 <= i; star1++) {
				System.out.print("*");
			}
			for(int zero2 = n - i; zero2 > 0; zero2--) {
				System.out.print("0");
			}
			System.out.print("*");
			for(int zero3 = n - i; zero3 > 0; zero3--) {
				System.out.print("0");
			}
			for(int star2 = i; star2 <= i; star2++) {
				System.out.print("*");
			}
			for(int zero4 = i - 1; zero4 > 0; zero4--) {
				System.out.print("0");
			}
			System.out.println();
		}
		
	}
}
