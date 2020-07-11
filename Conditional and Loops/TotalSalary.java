package ConditionalandLoops;

import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		double basic, hra, da, pf, total_sal;
		int allow;
		Scanner sc = new Scanner(System.in);
		basic = sc.nextInt();
		char grade = sc.nextLine().charAt(0);
		
		hra = (0.20 * basic);
		da = (0.50 * basic);
		pf = (0.11 * basic);
		
		if(grade == 'A') {
			allow = 1700;
		}else if(grade == 'B') {
			allow = 1500;
		} else {
			allow = 1300;
		}
		
		total_sal = basic + hra + da + allow - pf ;
		
		System.out.println(Math.round(total_sal));
		
	}
}
