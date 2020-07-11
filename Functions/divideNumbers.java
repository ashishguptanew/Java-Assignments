package Functions;

public class divideNumbers {
	
	public static int dividenumbers(int num, int deno) {
		if(deno == 0) {
			return Integer.MIN_VALUE;
		}
		//System.out.println("inside division function");
		return num/deno;
	}
	
	public static void printDivisionResult(int num, int deno) {
		if(deno == 0) {
			//exit the function
			System.out.println("No output, if divide by zero");
			return;
		}
		System.out.println(num / deno);
	}

	public static void main(String[] args) {
		int num = 8;
		int deno = 0;
		printDivisionResult(num, deno);
//		int result = dividenumbers(num, deno);
//		System.out.println(result);
	}

}
