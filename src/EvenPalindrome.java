import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EvenPalindrome {

	  static String evenlength(String n)
	    { 
		    String res = n;
	        for (int j = n.length() - 1; j >= 0; --j)
	            res += n.charAt(j);
	 
	        return res;
	    }
	
	    public static void main(String[] args)
	    {
	    	
	    	Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        
	        for(int i = 0; i < t; i++){
	            String ip=in.next();
	            int op= getResult(ip);
	            System.out.println(op);
	        }
	        
	        
	        
	    }

		private static int getResult(String ip) {
			// TODO Auto-generated method stub
			int maxCount=0,minValue=0;
			String evenVal=evenlength(ip);
			
			Map<Integer,Integer> opMap=new HashMap<Integer,Integer>();
			
			
			for(int i=0;i<evenVal.length();i++) {
				
				String val=""+evenVal.charAt(i);
				if(opMap.get(Integer.valueOf(val))==null)
				
				opMap.put(Integer.valueOf(val), 0);
				else {
					int count=opMap.get(Integer.valueOf(val));
					opMap.put(Integer.valueOf(val), count+1);
					
				}		
				
			}
			
			for(int j=0;j<10;j++) {
				
				
				if(opMap.get(j)!=null) {
					int Count=opMap.get(j);
					
					if(maxCount <Count) {
						maxCount=Count;
						minValue=j;
					}
					
					else if(maxCount==Count)
					{
						if(j<minValue) {
							minValue=j;
						}
					}
				}
					
			}
			return minValue;
		}
	}