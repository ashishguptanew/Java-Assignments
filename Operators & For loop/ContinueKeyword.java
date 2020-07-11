package ForLoop;

public class ContinueKeyword {

	public static void main(String[] args) {

//		int n = 5;
//		
//		for(int i =1; i <=n; i++) {//always use i++ in for loop increment statement
//			if(i == 4) {
//				continue; //go back to above to loop and 4 willn't print
//			}
//			//i++;
//			System.out.println(i);
//		}
		
		int i = 1;
		int n = 5;
		while(i <= n) {
			i++;
			if(i == 4) {
				//i++ //i++ should be fill at right place
					continue;//it'll not print 4 and still continue and skipped current iteration of the loop
			}
			i++;//it will becomes infinite
			System.out.println(i);
		}
}
}
