package ForLoop;

import java.util.Scanner;

public class SquareRootIntegral {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		//n=5;
		int output = 0;
		
		while(output * output <= n) {//0*0 1*1 2*2 3*3//condition fails
			output++;//1 2 3
		}
		output--;//3 - 1=2
		System.out.println(output);
	}
}
