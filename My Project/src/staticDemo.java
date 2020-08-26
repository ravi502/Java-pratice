class project
{
	int a;
	static int b=40;
	int c;
	
	public void add()
	{
		c=a+b;	
	}
	public void sub()
	{
		c=a-b;
	}
}
class staticDemo
{
	public static void main(String args[])
	{
		project addition= new project();
		addition.a=20;
		addition.b=10;
		addition.add();
		System.out.println(addition.c);
		
		project subtraction = new project();
		subtraction.a=20;
		subtraction.b=10;
		subtraction.sub();
		System.out.println(subtraction.c);
		
		
	}
	
}