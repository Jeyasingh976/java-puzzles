import java.util.Arrays;

public class RemoveRepetitions {
	 public static String transform(String input) {
	        
	        char temp[] = input.toCharArray();
		       Arrays.sort(temp);
		       input = new String(temp);
	        
	        int arrPointer = 1, incr = 1;
	         
	        
	        char arr[] = input.toCharArray();
	         
	       
	        while (incr != arr.length)
	        {
	            if(arr[incr] != arr[incr-1])
	            {
	                arr[arrPointer] = arr[incr];
	                arrPointer++;
	            }
	            incr++;
	        }
	         input = new String(arr);
	        return input.substring(0,arrPointer);
		       
	    }
	    
	    public static void main(String[] args) {
	        System.out.println(RemoveRepetitions.transform("abbcbbb"));        
	    }
	}
