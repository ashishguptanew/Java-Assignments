package ConditionalandLoops;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the first number ");
		int a = sc.nextInt();
		
		//System.out.println("Enter the operants ");
				sc.nextLine();
				char opers = sc.nextLine().charAt(0);
		
		//System.out.println("Enter the second number");
		int b = sc.nextInt();
		
		
		
		
		int result = 0;
		
		switch(opers) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			result = a / b;
			break;
		
			
			default:
				System.out.println("Invalid Number");
		
		}
		System.out.println("The Output is: " + result);
	}
	
}
