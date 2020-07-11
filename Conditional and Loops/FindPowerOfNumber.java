package ConditionalandLoops;

import java.util.Scanner;

public class FindPowerOfNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int n = s.nextInt();
		int ans = 1;//bcz when we mulitply 0*x it will give 0 always ans = 0
		for(int i = 0; i < n; i++) {
			ans *= x;
			System.out.println(ans + " " + x);
		}
		System.out.println(ans);
	}
}
