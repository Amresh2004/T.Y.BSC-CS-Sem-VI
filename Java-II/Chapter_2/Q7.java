//program for to print given Mesage N times after every 2 seconds

import java.util.*;
public class Q7 extends Thread
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("how many times:");
		int x=sc.nextInt();
		String s=sc.next();
		Thread t=new Thread(new Q7(x,s));
		t.start();
	}
	int n;
	String msg;
	Q7(int n,String msg)
	{
		this.n=n;
		this.msg=msg;
	}
	public void run()
	{
		try
		{
			for(int i=0;i<n;i++)
			{
				System.out.println(msg);
				sleep(2000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

