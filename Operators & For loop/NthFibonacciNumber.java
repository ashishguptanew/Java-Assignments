package ForLoop;

import java.util.Scanner;

public class NthFibonacciNumber {
//	F(n) = F(n-1) + F(n-2), 
//	Where, F(1) = F(2) = 1
	//0, 1, 1, 2, 3, 5, 8, 13, 21, 34.... we'' enter the index/ term and outpput gives only series number at specific index
	public static void main(String[] args) {
        int n1 = 1, n2 = 1, n3 = 0;
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        if(n == 1 || n == 2){//we'll print 1 in case of 1 & 2 term
            System.out.println(1);
            return;
        }
        for(int i = 3; i <= n; i++){//we'll start from 3rd term
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.print(n3);
        
	}
}
