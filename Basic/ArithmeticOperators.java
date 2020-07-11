package GettingStartedWithJava;

public class ArithmeticOperators {
public static void main(String[] args) {
	
	//int a = 10;
	//int b = 3;
	//int c = 10 % 3;// remainder
	//int c = 10 / 3;// divide
	//int c = 10 / 30;//it provide 0 as it should have to be 0.3 but we have input interger, output would also be integer
	//double c = 10 / 30;//double, it doesn't going to change the result.
	//int c = 3 + 2 / 5;
	//int c = 3 * 2 / 5;
	int a = 3;
	int b = 10;
	//int c = b / 2 * a ; we will get 15 as wrong as there will do first divide and then mulitply
	int c = b / (2 * a);// that's correct method to write as we are providing higher precedence by using brackets for 2*a
	System.out.println(c);
}
}
