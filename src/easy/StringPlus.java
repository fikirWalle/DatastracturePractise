package easy;

import java.util.ArrayList;
import java.util.List;

public class StringPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String answer=strplus("hellojava99");
		  System.out.println(answer);
	}
	
	private static String strplus(String s) {
		
		StringBuilder sb=new StringBuilder("");
		int result=0;
		List<Character>mylist=new ArrayList<Character>();
		mylist.add('1');
		mylist.add('2');
		mylist.add('3');
		mylist.add('4');
		mylist.add('5');
		mylist.add('6');
		mylist.add('7');
		mylist.add('8');
		mylist.add('9');
		mylist.add('0');
		
		for(int i=0;i<s.length();i++) {
			
			if(mylist.contains(s.charAt(i))) {
				
				   int num=Character.getNumericValue(s.charAt(i));
				  
				     result=result*10+num;
				}
			else {
			
			sb.append(s.charAt(i));
			
			}
		}
		  result=result+1;
		  String s2=String.valueOf(result);
		  
		  return sb.append(s2).toString();
	}

}
