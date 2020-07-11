package Functions;

public class MoreProblemsonFunctions {
	public static boolean isPrime(int x)
	{
	    for(int i=2;i<x/2;i++)
	    { 
	        if(x%i==0)
	        return false;
	    }
	    return true;

	}
	public static void main (String[] args) {
	    System.out.print(isPrime(47));
	}
//	    public static void func(int a) {
//	        int b = a;
//	        b = b + 10;
//	    }
//
//	    public static void main(String[] args) {
//	        int a = 10;
//	        func(a);
//	        //System.out.println(b);####Code will generate error as we are trying to print value of variable b in main and there isn't any variable b created or accessible in main. Variable b in the code is created inside function _func_ and is local to this function and not accessible outside it.
//	    }
//	public static void func1(int a,int b)
//	{
//	    int ans=1;
//	    for(int i=0;i<b;i++)
//	    {
//	        ans*=a;
//	    }
//	    System.out.print(ans);
//	}
//	public static void main (String[] args) {
//	    func1(2,5);
//	}
//	public static void func1(int a)
//	{
//	    System.out.print("a");
//	}
//	public static void main (String[] args) {
//	    func1(2.5);
//	}

}
