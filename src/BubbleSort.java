
public class BubbleSort {

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


		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=1;j<arr.length-i;j++) {
				
				
				if(arr[j-1]>arr[j]) {
					
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	}

}
