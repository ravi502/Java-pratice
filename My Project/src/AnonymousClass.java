class asdf
{
	public void xyz()
	{
		System.out.println("in A");
	}
}
public class AnonymousClass {
	public static void main (String args[])
	{
		asdf obj = new asdf()
				{
					public void xyz()
					{
						System.out.println("in asdf");
					}
				};
		obj.xyz();
	}

}
