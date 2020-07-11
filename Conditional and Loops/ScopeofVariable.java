package ConditionalandLoops;

public class ScopeofVariable {

	public static void main(String[] args) {
		
		int i = 1;
		int j = 10;//as j is a global variable or out side of while loop and it applies j++ and becomes 11 and print 11 son on..a.
		while(i <= 5) {
			j = 10;
			//int j = 10;
			System.out.println(j);
			i++;
			j++;//as it has scope under while loop and this times j become 11 but when it go back to above, it becomes as 10 abd destroy 11. and only for one round
		}
		System.out.println(i);
		System.out.println(j);//it is out of scope of while loop, it couldn't be printed out of parenthesis
		
//		int a = 10;
//		
//		a = 100;
//		
//		if(a >= 100) {
//			int b = 10;
//			System.out.println(b);//as we have assigned b & c under if, it could be used under if scope only
//		}else {
//			int b = 20;
//			System.out.println(b);//as we have assigned b & c under if, it could be used under else scope only
//		}
//		System.out.println(a);
//		//System.out.println(b);//there variable is out of score as we don't have declared b and c out side of if condition, it coulod be used under if condirion only.	
//		//System.out.println(c);//there variable is out of score as we don't have declared b and c out side of if condition, it coulod be used under if condirion only.	
}
}
