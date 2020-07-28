package easy;

import java.io.CharConversionException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String answer=codeHere("235");
		  System.out.println(answer);
	}
	
	public static String codeHere(String inputData) {
		
		int first=0;
		  int second=0;
		  int third=0;
		  int orginal=0;
		  int count=0;
		  Map<Character,Integer>mymap=new HashMap<Character,Integer>();
		     for(int i=0;i<inputData.length();i++){

		         mymap.put(inputData.charAt(i), i);
		     }
		       for(Entry<Character,Integer>entry:mymap.entrySet()){


		           if(entry.getValue().equals(0)){

		               char f=entry.getKey();
		               first=Character.getNumericValue(f);
		           }
		            if (entry.getValue().equals(1)) {

		                char s = entry.getKey();
		                second = Character.getNumericValue(s);
		                second=second*10;
		            }
		            if (entry.getValue().equals(2)) {

		                char t = entry.getKey();
		                third = Character.getNumericValue(t);
		                orginal=second+third;
		            }
		       }
		       System.out.println(first);
		       System.out.println(orginal);

		         for(int i=0;i<=orginal;i++){

		  if(i<=10){
         if(i==first) {

		      count++;
         }
		  }
		  else{

		      int mod=i%10;
		      int div =i/10;
		      if(mod==first){
		         
		                    count++;
		      }

		      if(div==first){
		                    count++;

		      }
		  }

		         }
		        String answer=String.valueOf(count);
		        return answer;
		    }

}
