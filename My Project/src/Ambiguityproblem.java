interface demo
{
	static void show()
	{
		System.out.println("in demo");
	}
}
interface mydemo 
{	
    default void show()
	{
		System.out.println("in my  demo");
	}
}
/* class demoimp implements demo,mydemo
{
	public void shower()
	{
		System.out.println("in class demo");
	}

	@Override
	public void show() {
		
		demo.super.show();
	}
}
*/
public class Ambiguityproblem {

	public static void main(String[] args) 
	{  
		demo.show();
	}
}

