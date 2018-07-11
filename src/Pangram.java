
public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "The quick brown fox jumps over the lazy dog";

   if (checkPangram(str) == true)
       System.out.println( " is pangram");
   else
	   System.out.println( " is not pangram");

  

	}

	private static boolean checkPangram(String str) {

		Boolean [] boolArr=new Boolean [26];
		boolean res=false;
		
		for(int i=0;i<str.toCharArray().length;i++) {
			
			char val=str.toCharArray()[i];
			
			if(val >='A' && val <='Z') {
				int index=str.toCharArray()[i]-'A';
				boolArr[index]=true;
				
				
			}else if(val >='a' && val <='z') {
				int index=str.toCharArray()[i]-'a';
				boolArr[index]=true;
				
				
			}
			
		}
		
		for(int j=0;j<=25;j++) {
			
			if(boolArr[j]==null) {
				res=false;
				break;
			}
			
			else if(boolArr[j]==false || boolArr[j]==null) {
				res=false;
				break;
			}
			else
				res=true;
			
		}
		return res;
		
	}

}
