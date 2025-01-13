//program for accept n movie names from user sort the list in decending order

import java.util.*;

public class Q14
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many movie names do you want to enter?");
        int n = sc.nextInt();
        sc.nextLine(); 

        ArrayList<String> movies = new ArrayList<>();

        System.out.println("Enter the movie names:");
        for (int i = 0; i < n; i++) 
	{
            String movie = sc.nextLine();
            movies.add(movie);
        }

        movies.sort(Collections.reverseOrder());

        System.out.println("Movies in descending order:");
        for (String movie : movies) 
	{
            System.out.println(movie);
        }
    }
}

