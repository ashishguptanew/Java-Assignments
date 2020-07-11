package ConditionalandLoops;

public class RelationalLogicalOperators {

	public static void main(String[] args) {
		int a = 10, b = 10;
//		System.out.println(a > b);
//		System.out.println(a < b);
//		System.out.println(a == b);
//		System.out.println(a != b);
//		System.out.println(a >= b);
//		System.out.println(a <= b);
		
//		System.out.println(true && false);
//		System.out.println(true || false);
		
		System.out.println(a >= 10 && b > 10);
		System.out.println(a >= 10 || b > 10);
		
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println(!(a > b));
		System.out.println(!(a == b));
		System.out.println(!(a >= b));
	}
}
