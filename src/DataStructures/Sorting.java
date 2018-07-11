package DataStructures;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			
			arr[i]=in.nextInt();
			
			
		}
		
		
		int op = descedingCount(arr,n);
		
		System.out.println(op);

	}

	private static int descedingCount(int[] a, int n) {


		
		
		int temp=0, count=0;
		
		
		 for (int i = 0; i < n; i++) 
	        {
			 boolean swap=false;
			 
			 
	            for (int j = i + 1; j < n; j++) 
	            {
	                if (a[i] < a[j]) 
	                {
	                	
	                	swap=true;
	                    temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	            
	            
	            if(swap)count++;
	        }
		 
		 
		return count;
	}

}
