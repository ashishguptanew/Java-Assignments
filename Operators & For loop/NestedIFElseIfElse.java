package ConditionalandLoops;
import java.util.Scanner;

public class NestedIFElseIfElse {

		public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			int a, b;
			a = s.nextInt();
			b = s.nextInt();
			
			if(a > b) {
				System.out.println("First num is greater");
				}
			else if(b > a) {
					System.out.println("Second num is greater");
				}
			else {
					System.out.println("Both are equal");
			}
				
//			if(a > b) {
//			System.out.println("First num is greater");
//			}if(b > a) {
//				System.out.println("Second num is greater");
//			}if(a == b) {
//				System.out.println("Both are equal");
//		}
			
//			if(a > b) {
			
//				System.out.println("First num is greater");
//			}if(b > a) {
//				System.out.println("Second num is greater");
//			}else {//this else is a part of if (b>a) so, it will be print when if condition doesn't satisfies..,and that's wrong
//				System.out.println("Both are equal");
//			}
			
//			if(a > b) {
//				System.out.println("First num is greater");
//			}else {
//				if(b > a) {
//				System.out.println("Second num is greater");
//			}else {
//				System.out.println("Both are equal");
//			
//		}
	}			
	}


