//program for print Hello meaasge n time after evry 5 second

import java.util.*;
public class Q6 extends Thread
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		Thread t=new Thread(new Q6(x));
		t.start();
	}
	int n;
	Q6(int n)
	{
		this.n=n;
	}
	public void run()
	{
		try
		{
			for(int i=0;i<n;i++)
			{
				System.out.println("Hello");
				sleep(5000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

