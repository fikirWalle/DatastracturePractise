package easy;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int re=reverse(1534236469);
		System.out.println(re);

	}
	
	private static int reverse(int x) {
		
		int rev=0;
		while(x!=0) {
			
			int mod=x%10;
			 if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && mod > 7)) return 0;
	            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && mod < -8)) return 0;
			
            rev=rev*10+mod;
           
			x=x/10;
			
		}
		
		
		return rev;
	}

}
