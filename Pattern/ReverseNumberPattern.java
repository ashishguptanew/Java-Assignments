package Patterns;

public class ReverseNumberPattern {

//	Pattern for N = 4
//			1
//			21
//			321
//			4321
	public static void main(String[] args) {
		int n = 4;
		for(int i = 1; i <= n; i++) {
			int p = i;
			for(int j = 1; j <= i; j++) {
				System.out.print(p);
				p = p - 1;
			}
			System.out.println();
		}
	}
	
}


