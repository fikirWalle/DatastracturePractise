package easy;

public class java8Thread {
	

public static void main(String args[]) {
		
		
		Runnable ob1=()->
		{
				
				for(int i=0;i<5;i++) {
					
					System.out.println("hi");
					
					try {
						Thread.sleep(1000);
					}
					catch(Exception e) {
						
					}
				}
				
			
		};
		Runnable ob2=()->
		{
				
				for(int i=0;i<5;i++) {
					
					System.out.println("hello");
					
					try {
						Thread.sleep(1000);
					}
					catch(Exception e) {
						
					}
				}
				
			
		};
			
		
		
		Thread t1= new Thread(ob1);
		Thread t2=new Thread(ob2);
		t1.start();
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			
		}
		t2.start();
	

		
		
}
}
