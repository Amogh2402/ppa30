import java.lang.*;
import java.util.*;

class ageinvalid extends Exception
{
	public ageinvalid(String str)
	{
		super(str);
	}
}

class exception6
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("enter your age");
		int age=sobj.nextInt();
				
		try
		{
			if(age<18)
			{
				throw new ageinvalid("age is below 18");
			}
		}
		catch(ageinvalid obj)
		{
			System.out.println("inside catch");
			System.out.println(obj);
		}
	}
}
			
		
	