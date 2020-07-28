package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Strstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      int annswer=strStr("a","");
		      System.out.println(annswer);
		      int annswer1=strStr("hello","ll");
		      System.out.println(annswer1);
		      int annswer2=strStr("aaaaa","bba");
		      System.out.println(annswer2);

	}
	
	
	 public static int strStr(String haystack, String needle) {
		 
		 if(haystack==null || needle==null)    
	            return -1;
	 
	 int h=haystack.length();
	 int n=needle.length();
	 
	      // if()
		 
		   
		  int start=0;
		  if(h>0&&n==0) {
			  
			  return -1;
		  }
		  if(h==0&&n>0) {
			  
			  return -1;
		  }
		   if(haystack.length()==0&&needle.length()==0)return 0;
		
		   
		    
		Map<Character, Integer>mymap=new HashMap<Character, Integer>();
	
		      
		     List<Character>mylist=new ArrayList<Character>();
		     
		           for(int i=0;i<haystack.length();i++) {
		        	   
		        	   
		        	   mylist.add(haystack.charAt(i));
		        	  
		           }
                for(int i=0;i<needle.length();i++) {
		        	   
		        	   
		        	
		        	   mymap.put(needle.charAt(i), i);
		           }
		           
		        
		     
		     
		        System.out.println(mylist);
		        	
		        	for(int j=0;j<needle.length();j++) {
		        		
		        		  if( !mylist.contains(needle.charAt(j))) 
		        		  
		        		  return -1;
		        		  
		        		  
		        		
		        	}
		        	
		        	for(int i=0;i<haystack.length();i++) {
		        		
		        		
		        		if(mymap.containsKey(haystack.charAt(i))) {
		        			
		        			   if(start==0) {
		        				   start=i;
		        				   break;
		        			   }
		        			   
		        			
		        		}
		        		
		        			
		        	}
		        
		        
		      
		   return start;
		 
		 
	 }
}
