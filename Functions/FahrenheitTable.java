package Functions;

import java.util.Scanner;

public class FahrenheitTable {

	public static void printFahrenheitTable(int start, int end, int step) {
		while(start <= end) {
			double celsious = (start-32) /1.8;
			System.out.println(start+"\t"+(int)celsious);
			start = start + step;
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int step = sc.nextInt();
		
		printFahrenheitTable(start, end, step);
	}
}
