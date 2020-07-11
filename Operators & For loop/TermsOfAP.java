package ForLoop;

import java.util.Scanner;

public class TermsOfAP {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int count = 0;
		for(int i = 1; count < n; i++) {
			int ap = 3 * i + 2;
			if(ap % 4 != 0) {
				System.out.println(ap+" ");
				count++;//count++ is inside of if function only if function gets satisfied then count will gets increased
			}
		}
	}
}
