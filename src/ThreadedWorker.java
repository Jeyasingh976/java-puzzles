
public class ThreadedWorker extends Thread{
	
	private volatile int myId ;
	 
    public ThreadedWorker ( int id ) {
        myId = id ;
   }
 
    public void run(){
    	
        System.out.println("myId is " +this.myId);
        
    }

}
