import java.lang.*;
import java.util.*;

class exception3
{
	public static void main(String arg[])
	{
		int Arr[]={10,20,30,40,50};
		Scanner sobj=new Scanner(System.in);

		System.out.println("enter the index");
		int index=sobj.nextInt();

		System.out.println("element at that index is :"+Arr[index]);
	}
}
