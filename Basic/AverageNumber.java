package GettingStartedWithJava;

import java.util.Scanner;

public class AverageNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		int avg = (a + b + c)/ 3;
		System.out.println(ch);//to print char name
		System.out.println(avg);// to print avg no. and we use one print and add + using operands
		                         //it'll show ch + avg value as per ASCII
	}
}
