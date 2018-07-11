
public class SeelectionSort {

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
 
        
        sort(arr);
         
        printArray(arr);
    }

	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i=0 ;i <arr.length-1;i++) {
			
			int minValue=arr[i];
			int swapVal=0;
			boolean swap=false;
			for(int j=i+1;j<arr.length;j++) {
				
				
				if(arr[j]<minValue) {
					swap=true;
					minValue= arr[j];
					swapVal=j;
					
				}
			}
			if(swap) {
				int temp=arr[swapVal];
				arr[swapVal]=arr[i];
				arr[i]=temp;
			}
				
				
			
			
		}
		
	}
}
