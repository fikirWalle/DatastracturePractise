package easy;

import java.util.HashSet;
import java.util.Set;

public class TheFirstRepeatedCharcter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String answer=repeted("JavaConceptOfTheDay");
    System.out.println(answer);
		
	}
	
	private static String repeted(String s) {
		
		int count=0;
		StringBuilder sb=new StringBuilder("");
		   Set<Character>hs=new HashSet<Character>();
		   
		   for(int i=0;i<s.length();i++) {
			   
			   if(hs.contains(s.charAt(i))) {
				   
				   count++;
				   sb.append(s.charAt(i));
				   break;
			   }
			   else {
				   
				   hs.add(s.charAt(i));
			   }
			   
		   }
		      return sb.toString();
	}

}
