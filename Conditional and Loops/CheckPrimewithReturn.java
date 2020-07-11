package ConditionalandLoops;
import java.util.Scanner;

public class CheckPrimewithReturn {
public static void main(String[] args) {
	
	int n;
	Scanner sc =new Scanner(System.in);
	n = sc.nextInt();
	
	int div = 2;
	while(div <= n-1 ) {//also use as while(div <= n/2)
		if(n % div == 0) {
			System.out.println("Composite");
			return;
		}
		div = div + 1;
	}
	System.out.println("Prime");
}


}
