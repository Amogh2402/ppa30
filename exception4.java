import java.lang.*;
import java.util.*;

class exception4
{
	public static void main(String arg[])
	{
		int Arr[]={10,20,30,40,50};
		Scanner sobj=new Scanner(System.in);

		System.out.println("enter the index");
		int index=sobj.nextInt();

		try
		{
			System.out.println("inside try");
			System.out.println("element at that index is :"+Arr[index]);
			
		}
		catch(ArrayIndexOutOfBoundsException obj)
		{
			System.out.println("inside catch");
			System.out.println(obj);
		}
		catch(Exception obj)
		{
			System.out.println(obj);
		}
		finally
		{
			System.out.println("inside finally");
			sobj.close();
		}

		System.out.println("end of application");
	}
}
