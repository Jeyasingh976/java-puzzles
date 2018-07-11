import java.util.HashMap;
import java.util.Map;

public class StringTest {

//	public String reverse(String str) 
//    {     
//        if ((str==null)||(str.length() <= 1) )
//            return str;
//        else
//        {
//        	System.out.println(str);
//        	return reverse(str.substring(1)) + str.charAt(0);
//        }
//        
//    }
    public static void main(String[] args) 
    {
//    	ThreadedWorker thread1 = new ThreadedWorker(1); // myId is one
//    	ThreadedWorker thread2 = new ThreadedWorker(2); // myId is two
//    	thread1.start(); // I thought that here thread1 would see the values of myId as 2 
//    	                 // because the thread2 constructor changed the instance variable shared by all threads
//    	thread2.start();
    	
    	Map<String,Integer> opTest=new HashMap<String,Integer>();

    	opTest.put("test", 1);
    	opTest.put("test", 2);
    	
    	
    	System.out.println(opTest.get("test"));
    	
    	
    }    
}
