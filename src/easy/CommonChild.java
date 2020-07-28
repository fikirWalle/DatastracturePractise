package easy;

import java.util.ArrayList;

import java.util.List;


public class CommonChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   int result=commonChild("ABCDEF","FBDAMN");
		   System.out.println(result);
	}
	static int commonChild(String s1, String s2) {
		
		  char []s1array=s1.toCharArray();
	       char []s2array=s2.toCharArray();
		int shaortlen=0;
		int same=0;
		int longlen=0;
		boolean large=false;
		
		if(s1array.length<s2array.length) {
			  
			shaortlen=s1array.length;
			longlen=s2array.length;
		}
		if(s2array.length<s2array.length){
			shaortlen=s2array.length;
			longlen=s1array.length;
			
		}
		if(s1array.length==s2array.length) {
			shaortlen=s2array.length;
			longlen=s1array.length;
		}
		
		     List<Character>mylist=new ArrayList<Character>();
		
		
		     
		       
		       for(int i=0;i<longlen;i++) {
		    	   for(int j=i;j<shaortlen;j++) {
		    		   if(!mylist.contains(s1array[j])) {
		    		   if(s1array[i]==s2array[j]) {
		    			   mylist.add(s1array[i]);
		    			   same++;
		    		   }
		    		   
		    	   }
		    	   }
		    	   if(i>shaortlen) {
		    		   large=true;
		    		   break;
		    	   }
              if(large==true) {
		    		   
		    		   break;
		    	   }
		    	   
		       }
		       return same;
		        
		       }
		       
		         
	}


