package ConditionalandLoops;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		
		//in case of nested if else or ifs condition is checked every time from top to bottom
		int dayOfweek = 2;
//		
//		if(dayOfweek == 1) {
//			
//		}
//		if(dayOfweek == 2) {
//					
//				}
//		if(dayOfweek == 3) {
//			
//		}
//		if(dayOfweek == 4) {
//			
//		}
//		if(dayOfweek == 5) {
//			
//		}
//		if(dayOfweek == 6) {
//			
//		}
//		if(dayOfweek == 7) {
//			
//		}
		
//		//Switch case is use to check expression once at a time
//		switch(dayOfweek) {
//		case 1:
//			System.out.println("I am on leave");
//			break;//it is used to get out of block
//		case 2:
//			System.out.println("I am in office");
//			break;//if we don't used break statement, it will print everything by default 
//					//after condition gets satisfied
//		case 3:
//			System.out.println("I'm playing football");
//			break;
//			
//			default:
//				System.out.println("I don't know what day it is");
//		}
		
		int rating = 3;
		
		switch(rating) {
		case 1:
		case 2:
			System.out.println("Bad review");
			break;
		case 3:
			System.out.println("Average review");
			break;
		case 4:
		case 5:
			System.out.println("Good Review");
			break;
		}
	}
}
