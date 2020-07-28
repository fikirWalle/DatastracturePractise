package easy;

import java.util.HashMap;
import java.util.Map;

public class Largestlastword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int answer=lengthOfLastWord("       ");
		System.out.println(answer);
		
		String answerr=winner("EHH","EME");
		System.out.println(answerr);

	}

	  public static int lengthOfLastWord(String s) {
		  
		 int count=0;
		 int c=0;
		  int len=s.indexOf(' ');
		  
		  
		  
		  
		    for(int i=0;i<s.length();i++) {
		    	
		    	 
		    	
		    }
		    System.out.println(len);
		    if(c==s.length()-1) return 0;
		   
		  for(int i=len+1;i<s.length();i++) {
			  
			  
			     count++;
		  }
		  
		  return count;
		  
		  
	  }
	  
	  public static String winner(String erica, String bob) {
		    // Write your code here
		  
		       
		       StringBuilder winner= new StringBuilder("");
		       
		        int sum=0;
		        int sum2=0;
		          if (erica.length()==0||bob.length()==0) {
		        	  
		        	  return null;
		          }
		       
		       Map<Character, Integer>mymap=new HashMap<Character, Integer>();
		       
		       mymap.put('E', 1);
		       mymap.put('M', 3);
		       mymap.put('H', 5);
		       
		       for(int i=0;i<erica.length();i++) {
		    	   if(mymap.containsKey(erica.charAt(i))) {
		    		   
		    		    sum+=mymap.get(erica.charAt(i));
		    		   
		    	   }
		    	   
		    	   
		       }
		       
		       
                for(int i=0;i<bob.length();i++) {
                	
                	 if(mymap.containsKey(bob.charAt(i))) {
  		    		   
 		    		    sum2+=mymap.get(bob.charAt(i));
 		    		   
 		    	   }
		    	   
		    	   
		       }
                     if(sum>sum2) {
                    	 
                    	 winner.append("Erica");
                     }
                     else {
                    	 
                    	 winner.append("Bob");
                     }
                
                   
                return winner.toString();

		    }
	   
	
	  
}
