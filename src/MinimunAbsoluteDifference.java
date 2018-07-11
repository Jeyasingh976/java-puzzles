import java.util.Arrays;
import java.util.Scanner;

public class MinimunAbsoluteDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        long[] arr = new long[n];
	        for(int i = 0; i < n; i++){
	            arr[i] = in.nextLong();
	        }
	        
	        long op=absDiffernce(arr,n);
	        System.out.println(op);
	}

	private static long absDiffernce(long[] arr, int n) {
		long minvalue=Math.abs(arr[1]-arr[0]);
				
				long diff=0;
		Arrays.sort(arr);
		
		for(int i=1; i< arr.length;i++) {
			 diff=Math.abs(arr[i]-arr[i-1]);
			 
			 if(minvalue > diff) {
				 minvalue=diff;
			 }
			
			
		}
		// TODO Auto-generated method stub
		return minvalue;
	}

}
