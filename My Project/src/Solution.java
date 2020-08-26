 import java.util.Scanner;

public class Solution 
{ 
	public static void main(String[] args) 
	{ 
		/*
	 Scanner sec = new Scanner(System.in);
	 	System.out.println("Enter the interger\n");
		int x=sec.nextInt(); 
		System.out.println("Enter the double");
		double y = sec.nextDouble(); 
		sec.nextLine();
		String s = sec.nextLine();

		System.out.println("String: "+s);
		System.out.println("Double: "+y);
		System.out.println("Int: "+x);     
		*/
		
		            Scanner sc=new Scanner(System.in);
		            System.out.println("================================");
		            for(int i=0;i<3;i++){
		            	System.out.println("Enter the string");
		                String s1=sc.next();
		                System.out.println("Enter the int");
		                int x=sc.nextInt();
		                System.out.printf("%-15s%03d%n", s1, x);
		            }
		            System.out.println("================================");

		    }
		
	
		}
 