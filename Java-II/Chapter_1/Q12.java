//program to demonstrare ListIterator

import java.util.*;

public class Q12 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> r = new ArrayList<>();
        r.add(10);
        r.add(20);
        r.add(30);

        ListIterator<Integer> l = r.listIterator();

        System.out.println("ArrayList elements:");
        while (l.hasNext()) 
	{
            System.out.println(l.next());
        }

        System.out.println("ArrayList elements in reverse order:");
        while (l.hasPrevious()) 
	{
            System.out.println(l.previous());
        }
    }
}

