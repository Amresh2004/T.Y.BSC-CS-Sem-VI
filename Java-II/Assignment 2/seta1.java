
/* program to print folowing details
   1. print("Covid19") 10 times
   2. print("Lockdown") 20 times
   3. print("Vaccine") 30 times
*/

import java.util.*;
public class seta1 extends Thread
{
	public static void main(String a[])
	{
		Thread t1=new Thread(new seta1(10,"Covid19"));
		t1.start();

		Thread t2=new Thread(new seta1(20,"Lockdown"));
                t2.start();

		Thread t3=new Thread(new seta1(30,"Vaccine"));
                t3.start();
	}
	int n;
	String s;
	seta1(int n,String s)
	{
		this.n=n;
		this.s=s;
	}
	public void run()
	{
		try
		{
			for(int i=0;i<n;i++)
			{
				System.out.println(s);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

