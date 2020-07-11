package ConditionalandLoops;



public class IfElseUsingTernaryOpes {

	public static void main(String[] args) {
		
		int a = 15;
		int b = 18;
		
		int maxOfBothNumbers = 0;
//		
//		if(a > b) {
//			maxOfBothNumbers = a;
//		}else {
//			maxOfBothNumbers = b;
//		}
		
		
		//Ternary Operator
		maxOfBothNumbers = a > b ? a : b;
		System.out.println("Max of Both Numbers is "+ maxOfBothNumbers);
}
		
		
}
