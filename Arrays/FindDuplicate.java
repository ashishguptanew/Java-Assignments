package array;

import java.util.Scanner;

//Sample Input 1:
//9
//0 7 2 5 4 7 1 3 6
//Sample Output 1:
//7
public class FindDuplicate {

	
	public static int findDuplicate(int[] arr){
	      
        for(int i=0 ; i<arr.length; i++)
        {
            for(int j=0; j< arr.length; j++)
            {
                if(i==j)
                {
                    continue;
                }
                if(arr[i]==arr[j])
                {
                    return arr[i];
                }
            }
            
        }
        return Integer.MAX_VALUE;
		
	}
	
//	public static int findDuplicate(int[] arr){
//	      
//        for(int i=0 ; i<arr.length; i++)
//        {
//            for(int j=i + 1; j< arr.length; j++)
//            {
//                if(arr[i]==arr[j])
//                {
//                    return arr[i];
//                }
//            }
//            
//        }
//        return Integer.MAX_VALUE;
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.print(findDuplicate(arr));
	}
}
