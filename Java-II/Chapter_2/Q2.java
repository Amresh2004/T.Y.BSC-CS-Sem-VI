//program for demonstarte simple Thread

import java.util.*;
public class Q2 extends Thread
{
	public static void main(String a[])
	{
		Thread t=new Thread(new Q2());
		t.start();
	}
	public void run()
	{
		System.out.println("My First Thread Program");
	}
}

