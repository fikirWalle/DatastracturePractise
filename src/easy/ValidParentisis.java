package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentisis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean answer=isValid("()");
		System.out.println(answer);
		boolean answer1=isValid("()[]{}");
		System.out.println(answer1);
		boolean answer2=isValid("(]");
		System.out.println(answer2);

	}
	
	 public static boolean isValid(String s) {
		 
		 Map<Character, Character>mymap=new HashMap<Character, Character>();
		 
		 
		   mymap.put('(', ')');
		   mymap.put('{', '}');
		   mymap.put('[', ']');
		   
		   Stack<Character>mystack=new Stack<Character>();
		   
		   for(int i=0;i<s.length();i++) {
			   
			   char input=s.charAt(i);
			   
			   if(mymap.keySet().contains(input)) {
				   
				   mystack.push(input);
				  
			   }
			   else if(mymap.values().contains(input)) {
				   
				   if(!mystack.isEmpty()&&mymap.get(mystack.peek())==input) {
					   
					   mystack.pop();
				   }
				   else { return false;};
				   
			   }
			  
		   }
		   
		   return mystack.isEmpty();
	        
	    }

}
