package ForLoop;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		//1100
		//0*2^0 + 0*2^1 + 1*2^2 + 1*2^3
		//0+0+4+8 = 12
		
		int n = 1100;
		int decimal = 0; 
		int base = 1;
		
		while(n > 0) {
			int rem = n % 10;
			n = n / 10;
			decimal = decimal + rem * base;
			base *= 2;
		}
		System.out.println(decimal);
	}
}
