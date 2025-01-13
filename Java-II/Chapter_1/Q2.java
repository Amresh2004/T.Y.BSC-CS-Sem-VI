import java.util.*;
public class Q2
{
	public static void main(String args[])
	{
		ArrayList a=new ArrayList();
		System.out.println("Initial Size of Arraylist is: "+ a.size());
		a.add("Amresh");
		a.add("Shubham");
		a.add("Mitesh");
		System.out.println(a);
		a.add(2,"Middle");
		System.out.println(a);
		a.remove(2);
		a.remove("Shubham");
	}
}

