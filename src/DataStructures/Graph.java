package DataStructures;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Graph {
	
	public int v;
	public Map  < Integer ,LinkedList<Integer> >  adj ;
	public LinkedList<Integer>  adjArr[];
	
	Graph(int v){
		this.v=v;
		
		adj=new  HashMap  < Integer ,LinkedList<Integer> >();
		adjArr=new LinkedList[v];
	for(int i=0;i<v;i++)
		adjArr[i]=new LinkedList();
		
 }

     void addEdge(Graph graph, int src, int dest)
    {
    
        	adjArr[src].add(dest);
        	 graph.adj.put(src, adjArr[src]);
        
       
         
      
        //graph.adj[dest].addFirst(src);
    }
	
	public  Map<Integer,Boolean>  bfs(int s) {
		
		//boolean visited [] =new boolean[v];
		
		Map<Integer,Boolean> visited=new HashMap ();
		
	//	visited[s]=true;
		
		
		Queue<Integer> queue = new LinkedList<>();
		LinkedList<Integer> op=new LinkedList<>();
		queue.add(s);
		
		while(queue.size()!=0) {
			
			int val= queue.poll();
			
				if(adj.get(val)!=null)
			         op = adj.get(val);
				else
					continue;
			
			for(int i=0;i <op .size() ;i++) {
				
				//System.out.println(visited.get(op.get(i)));
				
				if (visited.get(op.get(i))  ==null) {
					queue.add(op.get(i));
					visited.put(op.get(i), true);
				}
					
				
				
			}
			
		}
		return visited;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
       
        for(int i = 0; i < n; i++){
        	
        	// String[] str = in.next().split(" ");
             
             int v = in.nextInt();
             int edges =in.nextInt();
             Graph graph = new Graph(v);
         
        	for(int j=0;j <edges;j++) {
        		
        		 Integer src = in.nextInt();
        		 if(src==null)break;
                 int dest =in.nextInt();
        		
            
         		graph.addEdge(graph, src,dest);
         		
               
        	}
        	
        	int start=in.nextInt();
         	        String res="";
         		Map<Integer,Boolean>  op=graph.bfs(start);
         	        
         	        for(int k=1;k<=v;k++) {
         	        	
         	        	if( k !=start && op.get(k)==null )
         	        	res+=-1+ " ";
         	        	else if (k !=start && op.get(k)==true) 
         	        		res+=6+ " ";
         	        	
         	        }
         	       System.out.println(res);

         	
        		
        	}
        }
		
		
		

}
