package Functions;

public class MoreonFunctions {
	
	public static double sum(int a, int b, double c) {//function with name sum and o/t is int and it has more than one input
		double ans = a + b + c;//int+int+double shoud be store as vaiable under double
		return ans;//or return=a+b;//it should be return with process
	}
	public static void printEvenNumbers(int start, int end) {
		if(start % 2 != 0) {
			start++; 
		}
		for(int i = start; i <= end; i+=2) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		printEvenNumbers(3, 17);
		}
}
//	public static void main(String[] args) {
//		int num1 = 10;//initialization
//		int num2 = 16;
//		//sum(num1,num2, 10.5);//called a function but don't collect and don;'t priny and sysntax error will not showing as error
//		double ans = sum(num1,num2, 10.5);//input should be there as given as above in function//with sequences//one input is duuble it should be store double as vaiable
//		System.out.println(ans);
////	
	
//	public static double sum(int a, int b, double c) {//function with name sum and o/t is int and it has more than one input
//		double ans = a + b + c;//int+int+double shoud be store as vaiable under double
//		return ans;//or return=a+b;//it should be return with process
//	}
//
//	public static void main(String[] args) {
//		int num1 = 10;//initialization
//		int num2 = 16;
//		double ans = sum(num1,num2, 10.5);//input should be there as given as above in function//with sequences//one input is duuble it should be store double as vaiable
//		System.out.println(ans);
//	}

	
//	public static int sum(int a, int b) {//function with name sum and o/t is int and it has more than one input
//		int ans = a + b;
//		return ans;//or return=a+b;//it should be return with process
//	}
//
//	public static void main(String[] args) {
//		int num1 = 10;//initialization
//		int num2 = 16;
//		int ans = sum(num1,num2);//input should be there as given as above in function//with sequences
//		System.out.println(ans);
//	}

