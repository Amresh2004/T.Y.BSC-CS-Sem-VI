//program for accept N integer store them into a LinkedList & display only negative number

import java.util.*;

public class Q10 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> l = new LinkedList<>();

        System.out.println("How many numbers?");
        int n = sc.nextInt();

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) 
	{
            int s = sc.nextInt();
            l.add(s); 
        }

        System.out.println("Input list: " + l);

        System.out.println("Negative numbers in the list:");
        Iterator<Integer> i = l.iterator();
        while (i.hasNext()) 
	{
            int x = i.next(); 
            if (x < 0) 
	    { 
                System.out.println(x);
            }
        }
    }
}

