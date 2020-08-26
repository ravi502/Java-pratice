public class Rough 
{
   public static void main(String[] args) 
	{
	  System.out.println(abc(10,20,30));
	}
   public static int abc(int...apples)
   {
	   int sum=0;
	   for(int j:apples)
	   {
		   sum +=j;
	   }
	   return sum;
   }
}
