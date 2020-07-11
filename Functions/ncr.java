package Functions;

import java.util.Scanner;

public class ncr {
	 public static int factorial(int num) {//this is a function to use under main for many fact
		 int fact = 1;
			for(int i = 1; i <= num; i++)
			{
				fact = fact * i;
			} 
			return fact;
	 }
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = s.nextInt();

		int factN = factorial(n);//calling a function
		int factR = factorial(r);
		int factNR = factorial(n - r);
		int result = factN / (factR * factNR);
		System.out.println(result);
	
		
//		int n=10,r=6;
//	    int factn=1,factr=1,factnr=1;
//	    for(int i=2;i<=n;i++)
//	    {
//	        factn*=i;
//	        if(i<=r)
//	            factr*=i;
//	        if(i<=n-r)
//	            factnr*=i;
//	    }
//	    int ncr=factn/(factr*factnr);
//	    System.out.print(ncr);//factn=3628800. factr=720 factnr=24 ncr=3628800/(720 * 24) =210
	
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		int r = s.nextInt();
//		
//		int factN = 1;
//		for(int i = 1; i <= n; i++)
//		{
//			factN = factN * i;
//		}
//		
//		int factR = 1;
//		for(int i = 1; i <= r; i++)
//		{
//			factR = factR * i;
//		}
//		int factNR = 1;
//		for(int i = 1; i <= n - r; i++)
//		{
//			factNR = factNR * i;
//		}
//		int result = factN / (factR * factNR);
//		System.out.println(result);
	}

}
