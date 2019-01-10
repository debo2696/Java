import java.util.*;
import java.lang.*;
class UserEx extends Exception
{
	public void fun1()
	{
		System.out.println("Less than 18");
	}
}
class Ex1
{
	public static void main(String args[])
	{
	int a;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your age:");
	a=sc.nextInt();
	try
		{
		if(a<18)	
			throw new UserEx();
		}
		catch(UserEx b)
		{
			b.fun1();
		}
	}

}


