package ForLoop;

import java.util.Scanner;

public class NaturalLogof2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();//5
		float result = 0;
		for(float i = 1; i <= n; i++) {
			if(i % 2 == 0) {
				result -= 1/i;//0 = 0 - 1/2 = - 1/2
			}else {
				result += 1/i;//0 = 0 + 1/2 = 1/2
			}
			//System.out.println(result);
		}
		System.out.println(result);//0.78//1 - 1/2 + 1/3 - 1/4 + 1/5
	}
}
