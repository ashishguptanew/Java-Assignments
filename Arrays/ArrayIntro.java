package array;

public class ArrayIntro {
	
	public static void main(String[] args) {
		
		//Array Declaration
		//int[] marks = new int[5];
		
		//	int[] marks;
		//	marks = new int[10];
		
//		int[] arr = new int[5];
//		arr = new int[6];//now array has 6 sizes
		
		//int marks[] = new int[5];
		//int rollNos[], classes[];
		//int[] rollNos, classes;
		
//		int marks[] = new int[5];
//		System.out.println(marks[0]);//0
//		System.out.println(marks[1]);//0
		//System.out.println(marks[5]);// RunTime Error: ArrayOutOfBoundException
		
		int[] age = {2, 5, 1, 34, 12};
//		double[] marks = {1.0, 3.14, 2.9};
//		marks[1] = 4.56;//updating the value by assigning a new value to variable
//		System.out.println(age[3]);
//		System.out.println(marks[1]);
		
//		System.out.println(age[0]);
//		System.out.println(age[1]);
//		System.out.println(age[2]);
//		System.out.println(age[3]);
//		System.out.println(age[4]);	
		
		//Use for loop to iterate and print instead of repetitive code As written as above
		for(int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		}
}
}
