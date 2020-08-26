class A
{
	public void show()
	{
		System.out.println("in A");
	}
}
class B extends A
{
	public void show()
	{
		System.out.println("in B");
	}  
	public void config()
	{
		System.out.println("in config");
	}
}
class C extends A
{
	public void show()
	{
		System.out.println("in C");
	}
}
public class overriding 
{
	public static void main(String args[])
	{
		A obj = new B(); //run time polymoriphism
		obj.show();
		
		obj  = new C(); //dynamic method dispatch
		obj.show();
	}
}
