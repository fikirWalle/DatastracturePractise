package easy;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String answer=reverseme("GeeksforGeeks");
		 System.out.println(answer);
	}
	
	private static String reverseme(String s) {
		
		  StringBuilder sb=new StringBuilder("");
		  for(int i=s.length()-1;i>=0;i--) {
			  
			  sb.append(s.charAt(i));
		  }
		
		
		return sb.toString();
	}

}
