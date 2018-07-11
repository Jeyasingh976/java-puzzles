import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ipArr[] = new int[]{ 5,7,2,3,8,1,9}; 
		Arrays.sort(ipArr);
		int x=1;
		int res=binarySearch(ipArr,x,0,ipArr.length-1);
		System.out.println(res);
		
		
		

	}

	private static int binarySearch(int[] ipArr, int x, int start, int end) {

		while(start<=end) {
			
			int mid=(start+end)/2;
			
			
			if(x==ipArr[mid])
				return ipArr[mid];
			else if(x<ipArr[mid])
				end=mid-1;
			else
				start=mid+1;
			
		}

		return 0;
	}

	
}
