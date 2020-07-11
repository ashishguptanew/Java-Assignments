package Test1;

import java.util.Scanner;

public class CheckArmStrong {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int temp = n;
		int result = 0;
		while(temp > 0) {
			int last = temp % 10;
			temp /= 10;
			result += last * last * last;
		}
		//System.out.print(result);
		
		if(result == n) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		return;
	}
}
