package DataStoredandOperators;

public class Bitwise {

	public static void main(String[] args) {
//		5 -> 101
//		6 -> 110
//		4 -> 100 AND &
		
		//	   8421
		//10-> 1010
		//13-> 1101
		//15-> 1111 OR |
		
		//1101-> 0110 -> 0011 -> 0001 -> 0000 right shift operator
		//13     6       3       1       0 //divided by 2
		
//		&, Bitwise AND operator: returns bit by bit AND of input values.
//		|, Bitwise OR operator: returns bit by bit OR of input values.
//		^, Bitwise XOR operator: returns bit by bit XOR of input values.
//		~, Bitwise Complement Operator: This is a unary operator which returns the 
//		one’s compliment representation of the input value, i.e. with all bits inversed.
//		
		int a = 5;
		int b = 6;
		
		int c = a & b;
		System.out.println(c);//bitwise 4
		
		int a2 = 10;
		int b2 = 13;
		int c3 = a | b;
		System.out.println(c3);//bitwise 15
		
		int a1 = 10;
		int b1 = 13;
		int c2 = b1 >> 2;
		int c1 = b1 >> 1;
		int d = b1 << 1;
		int d1 = b1 << 2;
		System.out.println(c2);//right shift at 2 = 3
		System.out.println(c1);//right shift at 1 = 6
		System.out.println(d);//left shift will double at 1 = 26 (13*2)
		System.out.println(d1);//left shift will now double at 2 = 52 (26 * 2)
		
	}
}
