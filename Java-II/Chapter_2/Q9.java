import java.io.*;
import java.util.*;
class Q9 extends Thread
{
	public static void main(String args[])
	{
		Thread t=new Thread(new Q9());
		t.start();
	}
	public void run()
	{
		try
		{
		for(int i=1;i<10;i++)
		{
			Random r=new Random();
			int n=r.nextInt(50);
			sleep(5000);
			System.out.println(i);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}
