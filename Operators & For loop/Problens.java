package ForLoop;

public class Problens {
public static void main(String[] args) {
	
	int i = 1;
	while(i < 3) {// ith rows
	    int j = 0;
	    while(j < 5) {// jth print
	        j++;
	        if(j == 3) {
	            continue;
	        }
	        System.out.print(j + " ");
	    }
	    i++;
	}
	
//	int i = 1;
//	while(i < 3) {//i th rows
//	    int j = 1;
//	    while(j < 5) {//j th print
//	        if(j == 3) {
//	            break;
//	        }
//	        System.out.print(j + " ");
//	        j++;
//	    }
//	    i++;
//	}
//	for(int i=1;;i++)
//    {   if(i<5)
//        System.out.print(i);
//        else 
//            break;
//    }
//	for(int i=1;;i++)
//    {   if(i>5)
//        {
//            break;
//            //System.out.print("break statement reached");
//        }
//        System.out.print(i);
//    }
//	
	
//	for(int i=1;;i++)
//    {   if(i==5)
//            break;
//        System.out.print(i);
//    }
	
	
	
//	for(int i=7;i!=0;i--)//condition is i!=0;
//    {
//        System.out.print(i--);//post decrement
//    }
    }
}
