public class ThreadDemo
{
	public static void main(String args[]) throws Exception
	{
		Thread t1 = new Thread(() ->{
					for(int i=0;i<5;i++)
					{
					System.out.println("hi");
					try{Thread.sleep(1000);} catch(Exception e) {}
				}
			    
				});
				
		Thread t2 = new Thread(() ->{
					for(int i=0;i<5;i++)
					{
					System.out.println("hello");
					try{Thread.sleep(2000);} catch(Exception e) {}
				}
			    
				});
		System.out.println(t1.getName());
		t1.start();
		try {Thread.sleep(10);}	catch(Exception e) {}
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println("dude");
	}
}
