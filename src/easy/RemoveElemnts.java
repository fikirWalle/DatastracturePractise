package easy;

import java.util.ArrayList;
import java.util.List;

public class RemoveElemnts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i=removeElement(new int[] {3,2,2,3},3);
       
          System.out.println(i);
		   
	}
	
	 public static int removeElement(int[] nums, int val) {
		 
		 int j=0;
		 int n=nums.length;
		 List<Integer>mylist=new ArrayList<Integer>();
		   
		 for(int i=0;i<n;i++) {
			 
		
			 
			 if(nums[i]!=val) {
				 nums[j]=nums[i];
				 System.out.println(nums[j]);
				 j++;
			 }
		 }
		 
		 return j;
		 
		 
		 
	 }

}
