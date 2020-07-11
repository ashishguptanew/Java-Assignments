package ConditionalandLoops;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i = 1; i <= 10; i++) {//
			System.out.println(i * n);//it will print First 10 multiplication table
		}
	}

}
