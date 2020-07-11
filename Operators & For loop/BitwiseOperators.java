package ForLoop;

public class BitwiseOperators {
public static void main(String[] args) {

	int a = 10;
	int b = 2;
	
	//int c = a & b; //it will check in form of binaries
	//int c = a | b;
	System.out.println(a & b);//AND
	System.out.println(a | b);//OR
	System.out.println(a ^ b);//XOR
	System.out.println(~a);//NOT 
	System.out.println(~b);//NOT
	System.out.println(a << 1);//left shift by 1
	System.out.println(a << 3);//left shift by 1
    System.out.println(a >> 1);//right shift by 1
    System.out.println(a >> 3);
    System.out.println(a >> 2);
}
}