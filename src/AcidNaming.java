import java.util.Scanner;

public class AcidNaming {


    static String acidNaming(String acid_name) {
    	
    	String op="";
    	if(acid_name.length() >5)
    	{
    		
    		if(acid_name.substring(0,5).equals("hydro") &&
    				acid_name.endsWith("ic"))
    						op="non-metal acid";
    		else if(!acid_name.substring(0,5).equals("hydro") &&
        			acid_name.endsWith("ic"))
    			op="polyatomic acid";
        	else
        		op="not an acid";
    		
    			
    	}else
    	{
    	
    	 if(acid_name.endsWith("ic"))
			op="polyatomic acid";
    	else
    		op="not an acid";
    	
    	
    	}
		return op;
       
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String acid_name = in.next();
            String result = acidNaming(acid_name);
            System.out.println(result);
        }
        in.close();
    }
}
