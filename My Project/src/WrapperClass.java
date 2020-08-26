class addit{
	
	public void plus(Number i)
	{
		System.out.println(i);
	}
}
public class WrapperClass 
{

	public static void main(String[] args) 
	{
		addit obj = new addit();
		obj.plus(5.5);
	}

}
