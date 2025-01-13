// program for N number use any collection do not duplicate & search the elements is prent or not (use Iterator).

import java.util.*;

public class Q15
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        Set<Integer> numbers = new HashSet<>();

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) 
	{
            int num = sc.nextInt();
            numbers.add(num); 
        }

        Iterator<Integer> iterator = numbers.iterator();
        System.out.println("Unique numbers in the collection:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Enter a number to search:");
        int searchNum = sc.nextInt();

        if (numbers.contains(searchNum)) 
	{
            System.out.println(searchNum + " is present in the collection.");
        } 
	else 
	{
            System.out.println(searchNum + " is not present in the collection.");
        }

        sc.close();
    }
}

