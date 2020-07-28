package easy;

import java.util.ArrayList;
import java.util.List;

public class ODDnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=oddNumbers(3,9);
		System.out.println(list);
		

	}
	 public static List<Integer> oddNumbers(int l, int r) {
		 
		 List<Integer>mylist=new ArrayList<Integer>();
		 
		   for(int i=l;i<=r;i++) {
			   
			   
			   if(i%2!=0) {
				   mylist.add(i);
			   }
		   }
		   return mylist;
	 } 
	    

}
