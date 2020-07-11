package ForLoop;

public class BreakKeyword {
public static void main(String[] args) {
	int n = 5;
	
	for(int i = 1; i <= n; i++) {//i th rows
		for(int j = 1; j <=n; j++) {//print the number
			//if(i == j) {
			if(i + 1 == j) {//it takes you to n=5
				break;
				//return;//it just exits the code from main()
			}
			System.out.print(j +" ");
		}
		System.out.println();
	}
//	int i = 1;
//	while(i <= n) {
//		if(i == 4) {
//			break;
//			//System.out.println(i);//unreachable code
//		}
//		System.out.println(i);
//		i++;
//	}
//	
//	for(int j = 1; j <= n; j++) {
//		if(j == 4) {
//			break;
//		}
//		System.out.println(j);
//	}
	System.out.println("Outside while");
	
}
}
