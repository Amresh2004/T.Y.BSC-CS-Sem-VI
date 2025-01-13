// Java program that accepts N integers from the user, stores them, removes duplicates, and then displays the numbers in ascending order:


import java.util.*;

public class Q6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the number of integers:");
        int n = sc.nextInt();

        TreeSet<Integer> numbers = new TreeSet<>();

        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) 
	{
            int num = sc.nextInt();
            numbers.add(num);
        }

        System.out.println("Numbers in ascending order (duplicates removed):");
        for (int number : numbers) 
	{
            System.out.println(number);
        }
    }
}

