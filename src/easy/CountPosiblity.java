package easy;

public class CountPosiblity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		        int answer=countPalindromes("tacocat");
		        System.out.println(answer);
	

	}
	private static int countPalindromes(String s) {
	
		   
		        char[] A = new char[2 * s.length() + 3];
		        A[0] = '@';
		        A[1] = '#';
		        A[A.length - 1] = '$';
		        int t = 2;
		        for (char c: s.toCharArray()) {
		            A[t++] = c;
		            A[t++] = '#';
		        }

		        int[] Z = new int[A.length];
		        int center = 0, right = 0;
		        for (int i = 1; i < Z.length - 1; ++i) {
		            if (i < right)
		                Z[i] = Math.min(right - i, Z[2 * center - i]);
		            while (A[i + Z[i] + 1] == A[i - Z[i] - 1])
		                Z[i]++;
		            if (i + Z[i] > right) {
		                center = i;
		                right = i + Z[i];
		            }
		        }
		        int ans = 0;
		        for (int v: Z) ans += (v + 1) / 2;
		        return ans;
		    }
		
	 
	}
	

	


