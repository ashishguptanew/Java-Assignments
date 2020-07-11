package ForLoop;

public class IncrementDecrement {

	public static void main(String[] args) {
		
//int a = 60, b = 80;
//		
//		if(++a > 60 || b++ > 80)// as we have uses or || and if first condition is executed then no need to evaluate second condition as there is use of short circuit
//		{
//			System.out.println("Inside if");
//		}else {
//			System.out.println("Inside else");
//		}
//		System.out.println("a "+ a +" b "+ b);//a will print increment value, bcz it will be check and b will print old value as it was not evaluated and there is a short circuit.
		
		
		int a = 60, b = 80;
		
		if(++a > 60 && b++ > 80)// if first part is executed,it will increment value for b as well as there is no short circuit
		{
			System.out.println("Inside if");
		}else {
			System.out.println("Inside else");
		}
		System.out.println("a "+ a +" b "+ b);//a will print increment value, bcz it will be check and b will print also increment value as a executed and b fails to execute condition doesn't meet and print else but a = 61, b = 81.
//		
		
//		int a = 60, b = 80;
//		
//		if(a++ > 60 && b++ > 80)// if first part is not executed,it uses short circuiting, it stops to increment
//		{
//			System.out.println("Inside if");
//		}else {
//			System.out.println("Inside else");
//		}
//		System.out.println("a "+ a +" b "+ b);//a will print increment value, bcz it will be check and b will print old value as there is a short circuit
//		
		
		
		
		//int a = 60;
		
		//int b = a++;
		//int b = ++a;
		//int b = a--;
		//int b = --a;
		//System.out.println(a);//it will print a increment value by 1
		//System.out.println(b);//it will print assign values of a to b and print old value of a
					
				
				
//		int a = 60;
//		//a = a + 1;
//		System.out.println(a++);//it will first print old value of a
//		System.out.println(++a);//it will increase by 1 and print the ath value
//		System.out.println(a);//print a value after a++ increment
//		System.out.println(--a);
//		System.out.println(a--);
	}
}
