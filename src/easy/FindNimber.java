package easy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Result;





public class FindNimber {

	
	public static String findNumber(List<Integer> arr, int k) {
		
		
		 StringBuilder sb=new StringBuilder("");
        for(int i=0;i<arr.size();i++){
                if(arr.contains(k)) {
               	 
               	 sb.append("YES");
               	 return sb.toString();
                }

        }
        
       return	 sb.append("NO").toString();
        
	}
	
		// TODO Auto-generated method stub
		  public static void main(String[] args)throws IOException {
		        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

		        List<Integer> arr = new ArrayList<>();

		        for (int i = 0; i < arrCount; i++) {
		            int arrItem = Integer.parseInt(bufferedReader.readLine().trim());
		            arr.add(arrItem);
		        }

		        int k = Integer.parseInt(bufferedReader.readLine().trim());

		        String result = findNumber(arr, k);

		        bufferedWriter.write(result);
		        bufferedWriter.newLine();

		        bufferedReader.close();
		        bufferedWriter.close();
		    }

		
	

}
