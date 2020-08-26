class outer
{
	int a;
	public void ot()
	{
		System.out.println("outer class");
	}
	
	static class inner
	{
		static int b;
		static public void in()
		{
			System.out.println("inner class");
		}
	}
}

public class innerclass 
{
	public static void main(String args[])
	{
		outer obj = new outer();
		obj.a=10;
	
		obj.ot();
		
		outer.inner obj1 = new outer.inner();
		
		obj1.in();
		
	}
}
