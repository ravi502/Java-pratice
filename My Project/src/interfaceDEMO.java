interface ABC
{
	void show();
}
/*class DEF implements ABC
{
	public void show()
	{
		System.out.println("in DEF");
	}
} */
public class interfaceDEMO {

	public static void main(String[] args) {
			
		ABC obj = new ABC()    //interface along with anonymous class
				{
					public void show()
					{
						System.out.println("hi ");
					}
				};
		obj.show();

	}

}
