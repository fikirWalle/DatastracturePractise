package easy;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer=romanToInt("III");
		System.out.println(answer);
		int answer1=romanToInt("IV");
		System.out.println(answer1);
		int answer2=romanToInt("IX");
		System.out.println(answer2);
		int answer3=romanToInt("LVIII");
		System.out.println(answer3);
		int answer4=romanToInt("MCMXCIV");
		System.out.println(answer4);

	}
	
	private static int romanToInt(String s) {
		
		  HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	        map.put('I', 1);
	        map.put('V', 5);
	        map.put('X', 10);
	        map.put('L', 50);
	        map.put('C', 100);
	        map.put('D', 500);
	        map.put('M', 1000);
	        int len = s.length(), 
	        		result = map.get(s.charAt(len - 1));
	        for (int i = 0 ; i < len-1; i++) {
	            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1)))
	                result += map.get(s.charAt(i));
	            else
	                result -= map.get(s.charAt(i));
	        }

	       
	        return result;
	    }
		
	

}
