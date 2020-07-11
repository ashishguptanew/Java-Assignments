package ForLoop;

public class Precedence {
public static void main(String[] args) {
	int i = 6;
	int j = 8;
	
//	int c = 5 * 2 / 8;//it uses associativity from left to right ans=1
	int c = 5 * (2 / 8);//use of brackets gives high priority ans=0
   System.out.println(c);
   //boolean a = i + 5 > 5 &&  j > 6;//11 && 8 both are greater than and print a boolean variable
//	//int a = ++i * 5;//first add 1 to a as pre and * 5 ans =35
	//System.out.println(a);
}
}
