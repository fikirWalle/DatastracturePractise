package easy;

import java.util.ArrayList;

public class FindElementsOCCur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isfoundmoreones2(new int[] {4, 2, 2, 3,4, 5});
		
		//System.out.println(answer);
		isfoundmoreones(new int [] {4, 2, 2, 3,4, 5});
//System.out.println(answer);

	}
	
	
		
		
		
		
		
		
		
	
	private static void isfoundmoreones2(int arr[]) {
		
		ArrayList<Integer> mylist = new ArrayList<>();
		for(int i = 0; i < arr.length; i++){
		    int value = arr[i];
		    if(mylist.contains(value)){
		        System.out.print(" " + value);
		        
		    } else {
		        mylist.add(value);
		    }
		}
		/*i created arrayList and cheeck if this list contain that elemnt  using contains method 
if it is contain that elemnt will be print
why i use this Datastracture?

I uses this method because ArrayList is good algorithm for Rapid search.*/
		
	}
private static void isfoundmoreones(int arr[]) {
		
		int i=0;
		 for(i = 0; i < arr.length; i++) 
	        { 
	            if(arr[Math.abs(arr[i])] > 0) 
	                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])]; 
	            else
	                System.out.print(Math.abs(arr[i]) + " "); 
	        }  
		 /*the second way is i uses Maths.Abs method this takes O(n) computetion this is also good*/
		}
	
	

}
