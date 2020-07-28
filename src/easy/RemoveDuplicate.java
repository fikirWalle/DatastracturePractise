package easy;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	
	public static void main(String[]args) {
		
		int ans=removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4});
		System.out.println(ans);
	}
	
	public static int removeDuplicates(int[] nums) {
		
		  
		int n=nums.length;
		
		int j=0;
		
		for(int i=0;i<n;i++) {
			
			if(i<n-1&&nums[i]==nums[i+1]) {
				
				continue;
			}
			
			nums[j++]=nums[i];
			System.out.println(nums[j]);
			
		}
		
		return j;
		
	}
	
}


