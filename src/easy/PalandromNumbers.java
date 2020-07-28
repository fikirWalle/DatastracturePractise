package easy;

public class PalandromNumbers {

	
	public static boolean isPalandromNumbers(int x) {
		
		  String str=String.valueOf(x);
		 
		  int start=0;
		  System.out.println(start);
		  int end=str.length()-1;
		  System.out.println(end);
		  
		
		  while(start < end){
		        if(str.charAt(start++) != str.charAt(end--)) return false;
		    }
		  
		 
		
		return true;
	}
	
	public static void main (String args[]) {
		
		boolean anser=isPalandromNumbers(121);
		System.out.println(anser);
		
		
		
	}
}


