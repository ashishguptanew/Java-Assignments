package ConditionalandLoops;

public class numberOfDigits {

	public static void main(String[] args) {
		int n = 435245522;
		int noOfDigits = (int) (Math.log10(n) + 1);
		System.out.println(noOfDigits);
	}
}
