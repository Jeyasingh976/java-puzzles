import java.util.Scanner;

public class PartialSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] arr = new int[n];
	        for(int i = 0; i < n; i++){
	            arr[i] = in.nextInt();
	        }
		Integer lenth=partialDigit(n,arr);
		System.out.println(lenth);
		

	}

	private static Integer partialDigit(int n, int[] arr) {

		Boolean pointer=null;
		int len=0;

		for(int i=0;i<n;i++) {
			
			int value=arr[i];
			String digitVal=String.valueOf(value);
			
			char digitAyy[]=digitVal.toCharArray();
			String digitValue="";
			String combineddigitValue="";
			for(int j=0;j<digitAyy.length;j++) {
				
				 combineddigitValue=""+digitValue+digitAyy[j];
				 digitValue=""+digitAyy[j];
				 
				
				for(int k=i+1;k<n;k++) {
					
					String nextVal=String.valueOf(arr[k]);
					if(nextVal.contains(digitValue)) {
						
						pointer=true;
						if(len < digitValue.length())
							len=Integer.parseInt(digitValue);
						
					}if(nextVal.contains(combineddigitValue)) {
						pointer =true;
						if(len < Integer.parseInt(combineddigitValue))
							len=Integer.parseInt(digitVal);
						
					}
						
					else
					{
						pointer=false;
						break;
					}
						
					
					
					
				}
				
			}
			
		}
		return len;
	}

	private static int getLength(int value) {
		int length = 0;
		int temp = 1;
		while (temp <= value) {
		    length++;
		    temp *= 10;
		}
		return length;
		
	}

	
}
