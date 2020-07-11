package ConditionalandLoops;
import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		int i = 1; //Next num to be added
		int sum = 0;
		while( i <= n) {
			sum = sum + i;//adding i into sum
			i = i + 1;//increment
		}
		System.out.println(sum);
	}
}
