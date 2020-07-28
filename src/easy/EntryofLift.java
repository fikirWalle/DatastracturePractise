package easy;


import java.util.HashMap;
import java.util.Map;

public class EntryofLift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int answer=entryTime("1234","123456789");
		System.out.println(answer);

	}
	
	
	
	public static int entryTime(String s,String keypad) {
		
		 int count=0;
		 int add=0;
		   Map<Character, Integer>mymap=new HashMap<Character, Integer>();
		   
		      for(int i=0;i<keypad.length();i++) {
		    	  
		    	  mymap.put(keypad.charAt(i), add);
		    	  count++;
		    	  if(count==3) {
                          add=add+3;
		    	  }
		    	  if(count==6) {
		    		  add=add+3;
		    	  }
		    	  add++;
		      }
		   
		   System.out.println(mymap);
		     for(int i=0;i<s.length();i++) {
		    	 
		    	 
		    	 if(mymap.containsKey(s.charAt(i))) {
		    		 if(mymap.containsKey(s.charAt(i--))) {
		    			 
		    			 int a=Integer.parseInt(String.valueOf(i));
		    			 int b=Integer.parseInt(String.valueOf(i));
		    			{
		    				int c=mymap.get(a); 
		    				int d=mymap.get(b);
		    				
		    				System.out.println(c);
		    				System.out.println(d);
		    				 
		    			 }
		    		 }
		    		 
		    		 
		    	 }
		     }
		return 0;
		   
		   
		   
		
	

}}
