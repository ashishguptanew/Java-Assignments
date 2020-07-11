package array;

import java.util.HashMap;
import java.util.Scanner;

public class PairSum {
	//N= 9
	//arr= 1,3,6,2,5,4,3,2,4
	//x = 7
	
//	Output=
//	1 6
//	3 4
//	3 4
//	2 5
//	2 5
//	3 4
//	3 4
	
	private static void pairSum(int[] arr, int x) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] + arr[j] == x) {
					if(arr[i] < arr[j]) {
						System.out.println(arr[i]+" "+arr[j]);
					}else {
						System.out.println(arr[j]+" "+arr[i]);
					}
				}
			}
		}
		
}
	

//	private static void pairSum(int[] arr, int x) {
//		HashMap<Integer, Integer> map = new HashMap<>();
//		for(int i = 0; i < arr.length; i++) {
//			int key = arr[i];
//			if(map.containsKey(key)) {
//				int value = map.get(key);
//				map.put(key, value + 1);//incrementing freq value by 1 if key is already present in hashmap
//			}else {
//				map.put(key, 1);//initialize freq value to 1 if key is not already present in hashmap
//			}
//		}
//		//traversing the array and checking if -key is present in hashmap
//		for(int i = 0; i < arr.length; i++) {
//			int key = arr[i];
//			if(map.containsKey(-key) && map.get(key)!= 0) {
//				int times = map.get(key) * map.get(-key);
//				while(times != 0) {
//					System.out.print(Math.min(key, (-key))+" ");
//					System.out.println(Math.max(key, (-key)));
//					times--;
//				}
//				map.put(key, 0);
//				map.put(-key, 0);
//			}
//		}
//	}
	
//	
//	public static void pairSum(int []a,int sum)
//    {
//        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//
//        int i;
//
//        for (i = 0; i < a.length; ++i) 
//            map.put(a[i], sum-a[i]);
//        
//      
//        for (i = 0; i < a.length; ++i) 
//            if(map.containsValue(a[i]) && map.get(a[i])!=null)
//             {
//                System.out.println("("+a[i]+","+map.get(a[i])+")");
//                map.remove(a[i]);
//             }
//    }
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static Scanner S = new Scanner(System.in);

	public static int[] takeInput() {	
		int size = S.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = S.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		int x = S.nextInt();

		pairSum(arr, x);
	}

	
}
