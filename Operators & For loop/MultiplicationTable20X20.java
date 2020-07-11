package ForLoop;

public class MultiplicationTable20X20 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 20; i++) {
			int tableOf = i;//to be change as per i and i = tableof and i will print 20 lines of 20th table 
			for(int j = 1; j <= 10; j++) {
				
				System.out.print(tableOf * j +"  ");//try dry ur code 
			}
			System.out.println();
		}//we will get 1 to 20th tablea
	}
}
