package easy;

import java.util.HashMap;

public class LongestCommenPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String answer=longestCommonPrefix(new String[] {"flower","flow","flight"} );

		    System.out.println(answer);
		
		 
			String answer2=longestCommonPrefix(new String[] {""} );

		    System.out.println(answer2);
	}
	 public static String longestCommonPrefix(String[] strs) {
		 
		  String empity="";
		 if(strs == null || strs.length == 0)
			 return "";
            
             
            
		   
		    int n=0;
		      StringBuilder sb=new StringBuilder("");
		      
		      
		  
		 
	
		 
		   for(int i=0;i<strs.length;i++) {
			   
			     if(i<strs.length-2) {
			   if(strs[i].charAt(i)==strs[i+1].charAt(i)&&strs[i].charAt(i)==strs[i+2].charAt(i)) {
				   
				   sb.append(strs[0].charAt(i));
			   }
			   else {
			   
			      if(sb.length()==0) {
			 
				   
				   return empity;
			   
		   }
			      if(sb.length()>0&&strs[0].charAt(i)!=strs[1].charAt(i)||strs[0].charAt(i)!=strs[2].charAt(i)) {
			    	  
			    	      break;
			    	  
			      }
		   }
		  
		 
	 }
		   }
		   return sb.toString();
      
}}
