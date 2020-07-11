package ForLoop;

public class BitwiseOperator1 {
	
	public static void main (String[] args) {
	    int a=10,b=-20;
	    System.out.print(a^b);
	}
}
//Here the & operator is applied to the binary representation of 1 and -12. 
//The binary representation of 10 is 1010 and that of -20 is  1100(it is obtained by negating 10100
//and adding 1 to it ie 0 1011+1 =1100, also known as 2’s complement).… 1010 & 1100…… 1000 = 8 Hence the value is 8. 
//Theoretically & operation between two numbers x and -x gives the highest power of 2 which divides x.

//1010 (10)

//0000 0000 0000 0000 0000 0000 0001 0100  (20)
//1111 1111 1111 1111 1111 1111 1110 1011 Negative Number resp 1
//                                     +1
//                                   1100

//1010
//1100&
//1000 //8

//1010
//1100|
//1110 //-18

//1010
//1100^
//0110 //-26

//