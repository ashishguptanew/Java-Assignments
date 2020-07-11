package ForLoop;

public class Dec_To_Bin {

	public static void main(String[] args) {
		int n = 12;
		int temp = n;
		long binary = 0; 
		int base = 1;
		
		while(temp > 0) {
			int rem = temp % 2;
			temp = temp / 2;
			binary = binary + rem * base;
			base *= 10;//decimal base by 10
		}
		System.out.println(binary);
	}
}
