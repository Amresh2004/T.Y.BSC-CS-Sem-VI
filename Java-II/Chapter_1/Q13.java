//program for read N cities from user store them into the LinkedList. Program should not accept duplicate cities * among the city in asecdning order

import java.util.*;

public class Q13 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many cities?");
        int n = sc.nextInt();

        TreeSet<String> cities = new TreeSet<>();

        System.out.println("Enter city names:");
        for (int i = 0; i < n; i++) 
	{
            String city = sc.next();
            cities.add(city); 
        }

        System.out.println("Cities in ascending order (duplicates removed):");
        for (String city : cities) 
	{
            System.out.println(city);
        }
    }
}

