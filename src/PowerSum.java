
public class PowerSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=13;
		int n=2;
		int ans=totnum(x,n,1);
		System.out.println(ans);

	}

	private static int totnum(int X,int N,int num) {
		if(Math.pow(num,N)<X) {
			System.out.println(num+", "+X);
			System.out.println(num+", "+(X-Math.pow(num,N)));
	        return totnum(X,N,num+1)+totnum((int) (X-Math.pow(num,N)),N,num+1);
		}
			
	    else if(Math.pow(num,N)==X)
	        return 1;
	    else
	        return 0;
	}

}
