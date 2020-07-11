package ForLoop;

public class BitwiseProblem {
public static void main(String[] args) {
	    int a=10,b=20;
	    int c=a&b;
	    System.out.print(c);
	    int d=a|b;
	    System.out.print(d);
	    int e=a^b;
	    System.out.print(e);
	    int f=c+d+e;//+60
	    System.out.print(~f);// 00111100 60
	    //11000011 ~
	    //00111100
	    //+1
	    //00111101 = -61(32+16+8+4+1)
	}

}

