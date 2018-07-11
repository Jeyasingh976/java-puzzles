package DataStructures;

public class LinkedList {
	
	Node head;  // head of list
	 
    /* Linked list Node*/
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    
    private void push(int i) {
    	Node newNode=new Node(i);
    	if(head==null) {
    		
    		 head = newNode;
    	        return;	
    	}
    	newNode.next = null;
    	 
    	    /* 5. Else traverse till the last node */
    	    Node last = head; 
    	    while (last.next != null)
    	        last = last.next;
    	 
    	    /* 6. Change the next of last node */
    	    last.next = newNode;
    	    return;
		
	}
    
    
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList llist = new LinkedList();
		 
	        llist.push(7);
	        llist.push(1);
	        llist.push(3);
	        llist.push(2);
	        llist.push(8);
	 
	        System.out.println("\nCreated Linked list is: ");
	        llist.printList();
	}



	


	

}
