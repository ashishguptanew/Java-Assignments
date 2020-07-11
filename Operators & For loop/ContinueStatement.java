package ForLoop;

public class ContinueStatement {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			if(i  >= 40 && i <= 50) {
				continue;//it skips the current executing loop and moves to the next loop
			}
			System.out.println(i);//it will print 1 to 100 numbers except 40 to 50
		}
	}
}
