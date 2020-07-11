package array;

public class BasicsOfArray {

	public static void main(String[] args) {
		
		int arr [] = new int [10];
		arr [0] = 5;
		arr [5] = 17;
		System.out.println(arr[0]);//it will be print 5 at index 0
		System.out.println(arr[5]);//it will be print 17 at index 5
		
		//arr [-1] = 18;//negative index or less than 0 index will gives you runtime error: ArraayIndexOutofBoundException
		
		//arr[10] = 15;// we have array of 10 size with index 0 to 9 so, it will gies you runtime error: ArraayIndexOutofBoundException
		//System.out.println(arr [3]);//it will gives you with 0 as initially it was initialized with zero while new int..
		//System.out.println(arr [4]);
		
		char [] cArray = new char [10];
		double[] dArray = new double [10];
		System.out.println(cArray [0]);//it will gives you with null as initially it was initialized with null while new char..
		System.out.println(dArray [0]);//it will gives you with 0.0 as initially it was initialized with 0.0 while new double.
	}
}
