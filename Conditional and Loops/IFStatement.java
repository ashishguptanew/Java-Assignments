package ConditionalandLoops;

public class IFStatement {

	public static void main(String[] args) {
		int age = 24;
		
		if(age >= 18) {
			System.out.println("You can Vote Now.");//if condition satisfied then print otherwise no output
		}
		
		int noOfPetals = 5;
		if(noOfPetals % 2 == 0) {
			System.out.println("He loves me not");
		}else {
			System.out.println("He loves me");
		}
		
		int number = 22;
		if(number <= 10) {
			System.out.println("Number is less than 10");
		}else if(number > 10 && number <= 20) {
			System.out.println("Number is greater than 10 and less than 20");
		}else if(number > 20 && number <= 30) {
			System.out.println("Number is greater than 20 and less than 30");
		}else {
			System.out.println("Number is greater than 30");//if don't specify anything for value more than 30 then 
															//it will print nothing "no output"
		}
	}
}
