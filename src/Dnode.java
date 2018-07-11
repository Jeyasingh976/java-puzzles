
public class Dnode {
	
	
	public static int listCount=0;
	public int data;
	
	Dnode prev;
	Dnode next;
	
	public Dnode(int data){
		this.data=data;
		listCount++;
	}

}
