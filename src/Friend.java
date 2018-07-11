import java.util.Collection;
import java.util.*;

public class Friend {
    private List<Friend> friends;
    private String email;

    public Friend(String email) {
        this.email = email;
        this.friends = new ArrayList<Friend>();
    }

    public String getEmail() {
        return email;
    }

    public List<Friend> getFriends() {
        return friends;
    }

    public void addFriendship(Friend friend) {
        friends.add(friend);
        friend.getFriends().add(this);
    }

    public boolean canBeConnected(Friend friend) {
        
    	boolean res=false;
        for(int i=0;i<this.getFriends().size();i++){
            
            Friend obj=this.getFriends().get(i);
            
            if(obj.getEmail().equals((friend.getEmail()))) {
            	res=true;
    			break;
            }
               
            else
            {
            	
            	for(int j=0;j<obj.getFriends().size();j++) {
            		Friend childObj=obj.getFriends().get(j);
            		
            		if(childObj.getEmail().equals(friend.getEmail()))
            		{
            			res=true;
            			break;
            		}
            		else
            			continue;
            	}
            }
             
            
            
        }
        return res;
		
    }

    public static void main(String[] args) {
        Friend a = new Friend("A");
        Friend b = new Friend("B");
        Friend c = new Friend("C");

        a.addFriendship(b);
        b.addFriendship(c);

        System.out.println(a.canBeConnected(c));
    }
}