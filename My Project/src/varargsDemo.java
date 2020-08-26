class addition
{
	public int add(int...i)
	{
		int sum=0;
		for(int k : i)
		{
			sum=sum+k;
		}
		return sum;
	}
}
public class varargsDemo {
	public static void main(String[] args)
	{
		addition obj = new addition();
		System.out.println(obj.add(4,5,6,7,8,9));	
	}
}
