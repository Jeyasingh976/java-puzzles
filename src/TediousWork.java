import java.util.Scanner;

public class TediousWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        
	        int[] write = new int[n];
	        int[] online = new int[n];
	        for(int i = 0; i < n; i++){
	        	write[i] = in.nextInt();
	        }
	        
	        for(int i = 0; i < n; i++){
	        	online[i] = in.nextInt();
	        }

	        
	        int res=tediousResult(n,k,write,online);

	}

	private static int tediousResult(int n, int k, int[] write, int[] online) {

			int cost=0,start=0;
		for(int i=0;i<n;i++) {
			
			int writeTime=write[i];
			int onLineTime=online[i];
			
			if(writeTime<onLineTime) {
				
				cost=cost+writeTime;
				
			}else
			{
				for(int j=i;j<i+k;j++) {
				
					
					
					
					if(start<online[j]) {
						
						start=online[j];
						cost=cost+onLineTime;
						i++;
						
					}else {
						
						break;
						
					}
					
					
				}
			}
		}
		return cost;
	}

}
