package easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    int sum[]=twoSum(new int[] {7,3,6,4,0},6);
		    System.out.println(sum[0]);
		    System.out.println(sum[1]);
	}
	
	 public static int[] twoSum(int[] nums, int target)  {
		 
		  Map<Integer, Integer>map=new HashMap<Integer, Integer>();
		  
		  for(int i=0;i<nums.length;i++) {
			  
			  
			  map.put(nums[i], i);
		  }
		  
		  for(int i=0;i<nums.length;i++) {
			  
			  int other=target-nums[i];
			 
			  if(map.containsKey(other)&&map.get(other)!=i) {
				  
				  return new int[] {i,map.get(other)};
			  }
		  }
		  throw new IllegalArgumentException("no answe");
		 
	 }
	 

}
