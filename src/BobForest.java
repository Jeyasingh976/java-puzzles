import java.util.Scanner;

public class BobForest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        
        char [][] forest = new char[N][M];
       
         try {
			for(int i=0;i<N;i++){
			     for(int j=0;j<M;j++){
			     forest[i][j] = in.next().charAt(0);
			     }
			 }
			 System.out.println(forest);
			 int Q = in.nextInt();
			 //System.out.println("M and N "+Q);
			 
			 for(int i=0;i<Q;i++){
			     
			     int x = in.nextInt();
			     int result = solve(x,forest,N,M);
			     System.out.println(result);

			 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
         
         

	}

	private static int solve(int x, char[][] forest, int n, int m) {

		int count=0;
		for(int i=1;i<x;i++) {
			
			for(int j=0;j<n;j++) {
				
				for(int k=0;k<n;k++) {
					
					int pointer=0;
					while(pointer<x) {
						
						int rowStart=i-1;
						int rowEnd=i;
						int  columnStart=j-1;
						int columnEnd=j;
						int rowDiff=rowEnd-rowStart;
						int columnDiff=columnEnd-columnStart;
						
						if(forest[i][j]!='.') {
							count++;
							pointer++;
						}if(columnDiff ==x && columnDiff==x) {
							
						}
						
					}
					
				}
			}
		}
		return count;
	}

}
