package ForLoop;

import java.util.Scanner;

public class SumOrProduct {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int choice = s.nextInt();
		
		if(choice == 1) {//sum choice
			int sum = 0;//initialization
			for(int i = 1; i <= n; i++) {
				sum += i;//1 3 6 10 15
			}
			System.out.println(sum);//15
		}
		else if(choice == 2) {//product choice
			int product = 1;
			for(int i = 1; i <= n; i++) {
				product *= i;//1 2 6 24 120
			}
			System.out.println(product);//1205
		}
		else {
			System.out.println("-1");//other choice
		}
	}
}
