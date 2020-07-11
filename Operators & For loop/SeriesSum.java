package ForLoop;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		float result = 0;
		
		for(float i = 1; i <= n; i++) {
			result += 1/i;
		}
		System.out.println(result);
	}
}
