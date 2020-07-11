package ConditionalandLoops;

public class InfiniteSeries {

	public static void main(String[] args) {
		
		//To save our heap memory, we should have to take care with infinite series as below and in some cases,
		//it is required to keep them in heap memory, However, maintain take care with all of that
		
//		for(int i = 0; i < 10; ) {//there i = 0 always and not increasing
//			System.out.println(i);
//		}//Infinite Ex1
		
//		for(int i = 0; i < 10; i--) {//never condition satisfied
//			System.out.println(i);
//		}//Infinite Negative Ex2
		
//		for(int i = 0; ; i++) {//condition not specified
//			System.out.println(i);
//		}//Infinite Ex3
		
		for(; ; ) {
			System.out.println("hello world");//it print string infinte
		}
	}
}
