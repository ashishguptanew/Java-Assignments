package arraySortingSearching;

public class MergeSort {

	public static void mergeSort(int arr[], int start, int end) {
		if(start < end) {
			int mid = (start + end)/2;
			mergeSort(arr, start, mid);//from start to mid
			mergeSort(arr, mid + 1, end);//from mid + 1 to end
			merge(arr, start, mid, end);
		}
	}
	// m = mid
	static void merge(int arr[], int start, int m, int end) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - start + 1; 
        int n2 = end - m; 
  
        /* Create temp arrays */
        int Left[] = new int[n1]; 
        int Right[] = new int[n2]; 
  
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i) 
            Left[i] = arr[start + i]; 
        for (int j = 0; j < n2; ++j) 
            Right[j] = arr[m + 1 + j]; 
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = start; 
        while (i < n1 && j < n2) { 
            if (Left[i] <= Right[j]) { 
                arr[k] = Left[i]; 
                i++; 
            } 
            else { 
                arr[k] = Right[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) { 
            arr[k] = Left[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) { 
            arr[k] = Right[j]; 
            j++; 
            k++; 
        } 
    } 
		
	/* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        int arr[] = { 12, 11, 13, 5, 6, 7 }; 
  
        System.out.println("Given Array"); 
        printArray(arr); 
  
        MergeSort ms = new MergeSort(); 
        ms.mergeSort(arr, 0, arr.length - 1); 
  
        System.out.println("\nSorted array"); 
        printArray(arr); 
    } 
} 

	
