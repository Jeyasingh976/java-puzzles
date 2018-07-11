package RecusrionPractise;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=4;
		
		System.out.println(findFact(num));

	}

	private static int findFact(int num) {
		// TODO Auto-generated method stub
		
		if(num ==0)
			return 1;
		if(num==1)
			return 1;
		else
			return num * findFact(num-1);
			
		
		
	}

}
