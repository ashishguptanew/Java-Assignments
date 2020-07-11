package GettingStartedWithJava;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		System.out.println("Hello, World.\n" + str);
	}
}
