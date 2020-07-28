package easy;

class hi implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++) {
			
			System.out.println("hi");
			
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
		}
		
	}

	

}
class hello implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
for(int i=0;i<5;i++) {
			
			System.out.println("hello");
			
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
		}
		
	}
	
	
	
}
public class implementtation{
	
	public static void main(String args[]) {
		
		
		Runnable ob1=new hi();
		Runnable ob2= new hello();
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
