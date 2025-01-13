//Program to print Charcahter A to Z after every 2 seconds

import java.util.*;
public class Q4 extends Thread
{
	public static void main(String a[])
	{
		Thread t=new Thread(new Q4());
		t.start();
	}
	public void run()
	{
		try
		{
			for(char ch='A';ch<='Z';ch++)
			{
				System.out.println(ch);
				sleep(2000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

