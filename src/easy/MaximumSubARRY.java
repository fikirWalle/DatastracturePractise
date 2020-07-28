package easy;

public class MaximumSubARRY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int answer=maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4});
		System.out.println(answer);

	}
	  public static int maxSubArray(int[] nums) {
		  
		  
		  int size = nums.length; 
	        int max = Integer.MIN_VALUE, sum = 0; 
	  
	        for (int i = 0; i < size; i++) 
	        { 
	            sum = sum + nums[i]; 
	            if (max < sum) 
	                max = sum; 
	            if (sum < 0) 
	                sum = 0; 
	        } 
	        return max; 
	
}
}