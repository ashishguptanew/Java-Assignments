package array;

import java.util.Scanner;

public class AverageMarksOfStudent {

	public static void main(String[] args) {
		System.out.println("Enter the number of students: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Enter the marks now: ");
		int marks[] = new int[n];
		for(int i = 0; i < n; i++) {
			marks[i] = sc.nextInt();//taking the value from user and store into marks variable using iteration
		}
		
		int averageMarks = 0;
		
		for(int i = 0; i < n; i++) {
			averageMarks += marks[i];
		}
		
		averageMarks /= n;
		System.out.println("The Average marks are: " + averageMarks);
	}
}
