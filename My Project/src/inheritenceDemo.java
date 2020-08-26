class summing
{
	public int  add(int i,int j)
	{
		return i+j;
	}
}
class subtracting extends summing
{
	public int sub(int i,int j)
	{
		return i-j;
	}
}
public class inheritenceDemo
{
	public static void main(String args[])
	{
		subtracting obj = new subtracting();
	    int result =obj.add(4, 5);
	    int result2 =obj.sub(4, 5);
	    System.out.println(result);
	    System.out.println(result2);    
	}
}