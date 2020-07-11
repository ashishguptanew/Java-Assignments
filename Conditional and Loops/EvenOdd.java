package ConditionalandLoops;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		a = s.nextInt();
		
		int rem = a % 2;//this line of code is not required, if we use below// code
		boolean result = rem == 0;//this line of code is not required, if we use below// code
		
		if(result == true) {   //if(result) //if(rem == 0) //if(a % 2 == 0) //these could be conditions as well
			System.out.println(a + " is even ");
			
		//}if(a % 2 ==1){ if statement one more could also be used instead of else statement
			//System.out.println(a+" is odd");
		}else { //it's not essentials to use //else statemen// we can directly end the code of line
			System.out.println(a + " is odd ");
		}
	}

}
