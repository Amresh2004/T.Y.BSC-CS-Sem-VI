//progrm for demonstrate Iterator

import java.util.*;

public class Q11 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> r = new ArrayList<>();

        for (int i = 0; i < 10; i++) 
	{
            r.add(i);
        }

        System.out.println("List of numbers: " + r);

        System.out.println("Even or Odd classification:");
        for (int n : r) 
	{
            if (n % 2 == 0) 
	    {
                System.out.println("Even: " + n);
            } 
	    else 
	    {
                System.out.println("Odd: " + n);
            }
        }
    }
}

