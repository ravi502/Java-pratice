class apple
{
	int id;
	int salary;
    static String ceo = "yipee";
    
 
	
	public void order()
	{
		System.out.println(id + ":" + salary + ":" + ceo);
	}

}
public class Sdemo 
{
	public static void main(String args[])
	{
		apple ref1 = new apple();
		ref1.id=501;
		ref1.salary=2000000;
		
		
		
		apple ref2 = new apple();
		ref2.id=502;
		ref2.salary=100000;
		
		
		
		apple ref3 = new apple();
		ref3.id=503;
		ref3.salary=1070000;
		
		
		apple ref4 = new apple();
		ref4.id=504;
		ref4.salary=43100000;
	
		
		apple ref5 = new apple();
		ref5.id=505;
		ref5.salary=11200000;
	
		
		ref1.order();
		ref2.order();
		ref3.order();
		ref4.order();
		ref5.order();
		
		
	}
}
