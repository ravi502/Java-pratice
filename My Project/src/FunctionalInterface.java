interface cde
{
	void show();
}
public class FunctionalInterface {
	public static void main(String[] args) 
	{
		cde obj = () -> System.out.println("functional interface");
		obj.show();
	}}
