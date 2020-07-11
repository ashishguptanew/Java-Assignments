package ForLoop;

public class FindError {
public static void main(String[] args) {
	
	int a=10,b=50;
    a++;
    System.out.println(a);
    --b;
    System.out.println(b);
    int c=a--+b--;
   System.out.println(a+" "+b);
    System.out.print(++c);//a++,a=11. --b,b=49. c=a--+b--=11+49=60 a=10 b=48 print(++c)->print(61)
    
    
//	    int a=10,b=20;
//	    System.out.println(a+++--b);//line 1// 10 19
//	    System.out.println(a--+(++b));//line 2// 11+20
//	    System.out.println(a++-++b);//line 3// 10- 21
//	    System.out.println(a+++(++b));//line 4// 11 22
//	    
	    //As + operator and ++ operator have equal precedence. Similarly - and -- have equal precedence. 
	   //soin line 2 +++b and in line 4 +++b gives an error. To solve this error we can use +(++b).
	}


}

