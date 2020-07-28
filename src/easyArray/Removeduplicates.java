package easyArray;

import java.util.HashSet;

public class Removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer=removedeup(new int[] {1,1,2});
		System.out.println(answer);

	}
	
	private static int removedeup(int []arr) {
		
		int sum=0;
		HashSet<Integer>myset=new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			
			  if(myset.contains(arr[i])) {
				  
				  sum++;
			  }
			  else {
				  
				  myset.add(arr[i]);
			  }
			
		}
		System.out.println(myset);
		
		return myset.size();
		
		
		
		
		
	}

}
