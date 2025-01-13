//Java program for sccrpts N city names insert into ArrayList & display all elemnts .

import java.util.*;
public class Q4
{
	public static void main(String args[])
	{
		ArrayList<String> a=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter city names");
		for(int i=0;i<n;i++)
		{
			String s=sc.next();
			a.add(s);
		}
		System.out.println(a);
	}
}

