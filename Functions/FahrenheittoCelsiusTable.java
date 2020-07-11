package Functions;

import java.util.Scanner;

public class FahrenheittoCelsiusTable {

	
	
	public static void printFahrenheitTable(int start, int end, int step) {
		while(start <= end) {
			double celsious = (start-32) /1.8;
			System.out.println(start+"\t"+(int)celsious);
			start = start + step;
		}
	}
	

	
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		int step = s.nextInt();
		printFahrenheitTable(start, end, step);
	}
}
