package array;

import java.util.HashMap;
import java.util.Scanner;

//
//Sample Input 1 :
//6
//2 6 8 5 4 3
//4	
//2 3 4 7 
//Sample Output 1 :
//2 
//4 
//3
public class ArrayIntersection {

//	private static void intersections(int[] arr1, int[] arr2) {
//		for(int i = 0; i < arr1.length; i++) {
//			for(int j = 0; j < arr2.length; j++) {
//				if(arr1[i] == arr2[j]) {
//					System.out.println(arr2[j]);
//					arr2[j] = Integer.MIN_VALUE;
//					break;
//				}
//			}
//		}
//	}
	
	public static void intersections(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < arr1.length; i++) {//just store all elements of arr1 into hashmap<>
			if(map.containsKey(arr1[i])) {
				int value = map.get(arr1[i]);
				map.put(arr1[i], value + 1);
			}else {
				map.put(arr1[i], 1);
			}
		}
		for(int i = 0; i < arr2.length; i++) {//check in map that arr2[i] contains or not 
			if(map.containsKey(arr2[i])) {
				int freq = map.get(arr2[i]);
				if(freq > 0) {//if frq is greater than 0 then print that arr2[i[ and freq count now will be get less by one
					System.out.println(arr2[i] + " ");
					map.put(arr2[i], freq - 1);
				}
			}
		}
	}
	
	
	
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
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();

		intersections(arr1, arr2);
	}

	
}
