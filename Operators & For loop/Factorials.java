package ForLoop;

public class Factorials {

	public static void main(String[] args) {
		int factorial = 1;
		int n = 5;
		for(int i = n; i > 0; i--) {
			factorial = factorial * i;
			System.out.println(factorial + " " + i);
		}
		System.out.println(factorial);//120 factorail of number 5 = 120
	}
}
