//program for to print 1 to 10 numbers after every 5 secods

import java.util.*;
public class Q3 extends Thread
{
	public static void main(String a[])
	{
		Thread t=new Thread(new Q3());
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println(i);
				sleep(5000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

