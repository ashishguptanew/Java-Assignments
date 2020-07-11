package array;

public class PrimitativeandNonPremitative {
	
	public static void increment(int i) {
		i++;
	}
	
	public static void printArray(int [] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int[] incrementArray(int []input) {
		//System.out.println(input);
		input = new int[7];//it will create a new ref and length of input//input is local variable 
		for(int i = 0; i<input.length; i++) {
			input[i] = input[i] + 1; 	
		}
		return input;
		
	}

	public static void main(String[] args) {
//		int i = 10;
//		increment(i);
//		System.out.println(i);
		
		int [] arr = {1,2,3,4,5};
		//System.out.println(arr);//ref just copied not the whole array
		arr = incrementArray(arr);//now arr ref with new int[7 and print array will refer to this one arr
		printArray(arr);//it ref to above arr
}
}