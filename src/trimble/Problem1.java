package trimble;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,List<Integer>>opMap=new HashMap<Integer,List<Integer>>();
	for(int i=0;i<3;i++) {
		
		List<Integer>obj=new ArrayList<Integer>();
		obj.add(i);
		opMap.put(i,obj);
		
		
	}
	
	System.out.println(opMap);
    
	}

}
