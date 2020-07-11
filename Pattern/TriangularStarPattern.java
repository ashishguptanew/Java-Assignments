package Patterns;

public class TriangularStarPattern {

//TriangularStarPattern
//	* 
//	* * 
//	* * * 
//	* * * * 

	public static void main(String[] args) {
		for(int i = 1; i <=4; i++) {
			for(int j = 1; j <= i; j++) {//there * will be print i times and j<= ith value
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
