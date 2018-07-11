package StringTest;

public class StringCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="singh";
		String b=new String("singh");
		
		System.out.println(a.equals(b));// same value
		
		System.out.println(a==b);// different refernce values
		
		System.out.println(b.intern()==a);// intern method used to store string objects into the string pool
		
		
		String palindromeStr="amma";
		System.out.println("Str is "+checkPalindrome(palindromeStr));
		
		checkPalindromeUsingLoops(palindromeStr);
		
		String lowerCase="asass";
		
		System.out.println(lowerCase.toUpperCase());

	}

	private static void checkPalindromeUsingLoops(String palindromeStr) {
		
		try {
			throw new ArithmeticException("no palindrome");
		}catch(Exception exe)
		{
			System.out.println("catch"+exe.getMessage());
			
		}
		
//		for(int i=0;i<palindromeStr.length()/2;i++) {
//			
//			if(palindromeStr.charAt(i)!=palindromeStr.charAt(palindromeStr.length()-1-i)) {
//				return false;
//			}
//			
//		}
//		
//		return true;
	}

	private static Boolean checkPalindrome(String str) {
		
		if(str==null)
			return null;
		else
		{
			StringBuilder builder=new StringBuilder(str);
			if(builder.reverse().toString().equals(str)){
				return true;
				
			}
			else
				return false;
			
		}
		//return null;
	}

}
