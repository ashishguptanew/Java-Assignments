package GettingStartedWithJava;

public class LogicalBitComparison {

	public static void main(String[] args) {
		
		int number = 40;
		if(number >= 1 & number <= 100) {//It will check all condition whether first condition true or false
			System.out.println("Number is in range");
		}
		
		int num = -4;
		if(num >= 1 & num <= 100) {//Bitwise AND &
			System.out.println("Number is in range");//No output
		}
		
		int number1 = 40;
		if(number1 >= 1 && number1 <= 100) {//if first condition is not true, it will not check any subsequent conditions
			System.out.println("Number is in range");
		}
		
		int number2 = -40;
		if(number2 >= 1 && number2 <= 100) {//logical AND &&
			System.out.println("Number is in range");
		}
		//& and && will give same output of results
	}
}
