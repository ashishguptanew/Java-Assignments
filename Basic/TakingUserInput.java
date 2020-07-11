package DataStoredandOperators;

import java.util.Scanner;

public class TakingUserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		int i = sc.nextInt();
//		double dou = sc.nextDouble();
		//String str = sc.nextLine();
		
//		System.out.println(i);
//		System.out.println(dou);
		//System.out.println(str);
		//Taking user Input
		int principal = sc.nextInt();
		float rate = sc.nextFloat();
		int time = sc.nextInt();
		
		
//		int principal = 5000;
//		float rate = 12.5f;
//		int time = 12;
//		
		float simpleInterest = principal * rate * time / 100;
		
		//System.out.println("This Simple Interest is: " + simpleInterest);
		
	}
}
