package easy;

public class SearchTargetedPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   int answer=searchInsert(new int [] {1,3},3);
		   int answer1=searchInsert(new int [] {1,3,5,6},2);
		   int answer2=searchInsert(new int [] {1,3,5,6},7);
		   int answer3=searchInsert(new int [] {1,3,5,6},0);
//		   
		   System.out.println(answer);
	   System.out.println(answer1);
	   System.out.println(answer2);
	   System.out.println(answer3);
	}
	
	
	private static int searchInsert(int[] nums, int target) {
		 int position=0;
		
/*		  int n=0;
		  int position=0;
		   if(nums.length%2==0) {
			   
			 n=nums.length/2;
		   }
		    if(nums.length%2!=0) {
		    	
		    	n=nums.length-1/2;
		    }

		       if(nums.length==1) {
		    	   
		    	   if(target>nums.length) {
		    		   
		    		  return  position=1;
		    		  
		    	   }
		       }
		       if(nums.length==0) {
		    	   
		    	   return 0;
		       }
		    
		     if(target< n) {
		    	
		    for(int i=0;i<=n;i++) {
		    
		    	
		    		 if(nums[i]==target) {
		    			 position=i;
		    			 break;
		    		 }
		    		 if(nums[i]>target&&i==0) {
		    			 
		    			 position=0;
		    			 break;
		    		 }
		    		 if(i<n-1) {
		    	    if(nums[i]>target&&nums[i+1]>target) {
		    	    	
		    	    	position=i+1;
		    	    	break;
		    	    }
		    
		    	 }
		    }
		     }
		     else {
		    
		    	
		    	 for(int i=n;i<nums.length;i++) {
		    		
		    		 if(i<nums.length-1) {
			    		 if(nums[i]==target) {
			    			 position=i;
			    			 break;
			    		 }
			    		 if(nums[i]>target) {
			    			 
			    			 position=i-1;
			    			 break;
			    		 }
                       
                        if(target>nums[nums.length-1]) {
                        	
                        	position=nums.length;
                        	break;
                        }
			    	
		     }
		    	 }
	}
		
		return position;
		
	}*/
		    for(int i=0;i<nums.length;i++) {
		    	
		    	 if(target>nums[nums.length-1]) {
		    		 
		    		 position=nums.length;
		    		 break;
		    	 }
		    	 if(target==nums[nums.length-1]) {
		    		 position=nums.length-1;
		    		 break;
		    		 
		    	 }
		    	
		    	 if(target<nums[0]) {
		    		 
		    		 position=0;
		    		 break;
		    	 }
		    	
		    	if(i<nums.length-1) {
		    		
		    		if(target==nums[i]&&target<nums[i+1]) {
		    			
		    			position=i;
		    			break;
		    		}
		    		
		    		if(target>nums[i]&&target<nums[i+1]) {
		    			
		    			position=i+1;
		    			break;
		    		}
		    	}
		    }
		    
		       return position;
	}
}	     
