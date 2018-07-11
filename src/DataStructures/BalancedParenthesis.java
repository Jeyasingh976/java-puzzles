package DataStructures;

import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char exp[] = {'{','(',')','}','[',']'};;
		
		Boolean op=check(exp);
		
		if(op)System.out.println("balenced");
		else System.out.println(" Not balenced");

	}

	private static Boolean check(char[] charArray) {
		
		Stack <Character> charStack=new Stack <Character>();
		 Boolean flag = true;

		for(int i =0; i < charArray.length;i++) {
			
			if(charArray [i]=='{' ||  charArray [i]=='(' || charArray [i]=='[' )
				charStack.push(charArray[i]);
			if (charArray[i] == '}' || charArray[i] == ')' || charArray[i] == ']')
			{
				if (charStack.isEmpty())
	               {
	                   return false;
	               } 
				else
				{
					char character2=charArray[i];
					char character1= charStack.pop();
					
					if (character1 == '(' && character2 == ')')
						flag= true;
				       else if (character1 == '{' && character2 == '}')
				    	   flag= true;
				       else if (character1 == '[' && character2 == ']')
				    	   flag= true;
				       else
				    	   flag= false;
						
				}
				
				
				
				
			}
			
			
		}
		return flag;
	}

}
