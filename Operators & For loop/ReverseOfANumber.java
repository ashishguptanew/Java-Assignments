package ForLoop;

import java.util.Scanner;

public class ReverseOfANumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int temp = n;
		int rev_num = 0;
		
		while(temp > 0) {
			int lastDigit = temp % 10;
			temp = temp / 10;
			rev_num = rev_num * 10 + lastDigit;
		}
		System.out.println(rev_num);
	}
}
