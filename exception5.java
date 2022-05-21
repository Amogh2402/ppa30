import java.lang.*;
import java.util.*;
class demo
{
	public void Division(int no1,int no2)throws ArithmeticException
	{
		return no1/no2;
	}
}
class exception5
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("enter first number");
		int no1=sobj.nextInt();

		System.out.println("enter second number");
		int no2=sobj.nextInt();

		demo dobj=new demo();
		try
		{
		int ret=dobj.Division(no1,no2);	
		System.out.println("Division is :"+ret);
		}
		catch(ArithmeticException obj)
		{
			System.out.println("inside catch");
		}
	}
}
			
		
	