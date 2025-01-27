import java.io.*;
import java.util.*;
class square extends Thread
{
	int n;
	square(int n)
	{
		this.n=n;
	}
	public void run()
	{
		System.out.println("Square:"+n*n);
	}
}
class cube extends Thread
{
	int n;
	cube(int n)
	{
		this.n=n;
	}
	public void run()
	{
		System.out.println("Cube:"+n*n*n);
	}
}
class number extends Thread
{
	int n;
	public void run()
	{
		try
		{
			Random r=new Random();
			for(int i=1;i<=10;i++)
			{
				n=r.nextInt(20);
				System.out.println("generated number is:"+n);
				if(n%2==0)
				{
					square s=new square(n);
					s.start();
				}
				else
				{
					cube c=new cube(n);
					c.start();
				}
				sleep(2000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class Q10
{
	public static void main(String args[])
	{
		number n=new number();
		n.start();
	}
}
