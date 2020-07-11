package ForLoop;

import java.util.Scanner;

public class FibbonacciSeries {
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34.. we'' enter the index/ term..output will be given as fib series
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        
        for(int i = 0; i < n - 2; i++) {
        	int c = a + b;
        	System.out.print(c+" ");
        	a = b;
        	b = c;
        }
	}
}
//using alternative approach
//public static boolean chechNumber(int n) {
//	int a = 0;
//	int b = 1;
//	int c;
//	while(a < n) {
//		c = a + b;
//		a = b;
//		b = c;
//	}
//	if(a == n) {
//		return true;
//	}else {
//		return false;
//	}
//}