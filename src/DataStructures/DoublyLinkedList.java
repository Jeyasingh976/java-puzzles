package DataStructures;

public class DoublyLinkedList {
	
	Node head;
	
	class Node{
		
		int data;
		
		Node prev;
		Node next;
		
		
		Node(int data){
			this.data=data;
		}
	}
		
		void DoublyLinkedList(){
			this.head=null;
		}
		
		public void insert(int data) {
			
			insertIntoList(data);
			
		}
		
	

	private void insertIntoList( int data) {
			
		Node newNode =new Node(data);
		
		
         
	        /* 3. Make next of new node as head and previous as NULL */
		newNode.next = head;
		newNode.prev = null;
		
		if(head!=null) {
			head.prev = newNode;
			
			
		}
		
		 head = newNode; 
			
		}
	
	private void appendIntoList( int data) {
		
		Node newNode =new Node(data);
		
		
		Node last=head;
		
		
		if(head==null) {
			newNode.prev=null;
			head=newNode;
			return ;
		}
		else
		{
			
			while(last.next !=null) 
				last=last.next;
			
			last.next=newNode;
			newNode.prev=last;
			
		}
         
	        /* 3. Make next of new node as head and previous as NULL */
		
		
		}
	
	public void printlist(Node node)
    {
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while(node != null)
        {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null)
        {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedList dList=new DoublyLinkedList();
		
		dList.appendIntoList(20);
		dList.appendIntoList(22);
		dList.appendIntoList(24);
		
		dList.printlist(dList.head);

	}

}
