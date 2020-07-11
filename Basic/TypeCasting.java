package DataStoredandOperators;

public class TypeCasting {

	public static void main(String[] args) {
		
		byte x = 2;
		int y = x;
		double z = y;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		double myDouble = 3.14;
		int myInt = (int)myDouble;
		byte myByte = (byte)myInt;
		System.out.println(myDouble);
		System.out.println(myInt);
		System.out.println(myByte);
		System.out.println('a' + 'b');
		System.out.println('a' + x);
		System.out.println(x + 'a');
	}
}
