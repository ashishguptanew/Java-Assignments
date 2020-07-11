package ForLoop;

public class Power {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int result = 1;
		for(int i = 0; i < b; i++) {
			result *= a;
			System.out.println(a+" "+ i);
		}
		System.out.println(result);
	}
}
