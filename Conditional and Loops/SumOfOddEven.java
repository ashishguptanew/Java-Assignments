package ConditionalandLoops;

import java.util.Scanner;

public class SumOfOddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int eSum = 0;
		int oSum = 0;
		
		while(temp > 0) {
			int lastDigit = temp % 10;//it will mode by 10 give last digit
			temp /= 10;//it will divide till it becomes zero
			if(lastDigit % 2 == 0) {
				eSum += lastDigit;
			}else {
				oSum += lastDigit;
			}
			System.out.println(lastDigit +" " + temp + " " + eSum + " " + oSum);
		}
		System.out.println(eSum + " " + oSum);
	}
}
