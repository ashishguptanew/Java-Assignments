package ConditionalandLoops;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		int i = 1;
		while( i <= n ) {
			System.out.println(i);
		     i = i + 1;//if we don't write this increment statement, it could provide i infinite times....as i doesn't make change at all
		}
		
//		int i = 1;
//		while( i <= n ) {
//			System.out.println("Hello");
//		     i = i + 1;
//		}
	}
}
