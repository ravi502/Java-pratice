
public class adding_arrays
{
 public static void main(String args[])
	{
		int a[]= {10,20,30,40,50,60,70};
		change(a);
		for(int k:a)
		{
			System.out.println(k);
		}
	}
	public static void change(int b[])
	{
		for(int r=0;r<b.length;r++)
		{
			b[r]+=5;
		}
	 
	 int a[]= {10,20,30,40,50};
	 for(int k:a)
	 {
		 System.out.print(" " + k);
	 }
}
}