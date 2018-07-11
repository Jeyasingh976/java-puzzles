
public class InsertionSort {

	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
 
    // Driver method
    public static void main(String args[])
    {        
        int arr[] = {12, 11, 13, 5, 6};
 
        InsertionSort ob = new InsertionSort();        
        ob.sort(arr);
         
        printArray(arr);
    }

	private void sort(int[] arr) {


		
		for(int i=1;i<arr.length;i++) {
			
			int key = arr[i];
			int j=i-1;
			
			
			while(j>=0 && key <arr[j]) {
				
				arr[j+1]=arr[j];
				arr[j]=key;
				
				j--;
			}
			
		
		}
		
		
		
	}
}
