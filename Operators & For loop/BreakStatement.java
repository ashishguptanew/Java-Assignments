package ForLoop;

import java.util.Scanner;

public class BreakStatement {

	public static void main(String[] args) {
		
//		int n = 100;
//		
//		for(int i = 0; i <= n; i++) {
//			if(i == 35) {
//				break;
//			}
//			System.out.println(i);
//		}
		
		Scanner s = new Scanner(System.in);
		
		for(;;) {
			int n = s.nextInt();
			if(n < 0)
				break;//it will terminate the program only if we gets negative number or less than 0
		}
	}
}
