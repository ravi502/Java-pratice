class calc
{
	int a;
	int b;
	int result;
	public void perform()
	{
		result=a+b;
	}
}
public class object 
{
	public static void main(String args[])
	{
		calc obj = new calc();
		obj.a=12;
		obj.b=13;
		obj.perform();
		System.out.println(obj.result);
	}
	
}
