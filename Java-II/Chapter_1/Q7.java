/*program for create the LinkedList of string object to perform the following opeartons.
  1.Add
  2.delelte
  3.Display the reverse order
*/

import java.util.*;

public class Q7 
{
    public static void main(String[] args) 
    {
        LinkedList<String> l = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        while (true) 
	{
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add an element");
            System.out.println("2. Delete an element");
            System.out.println("3. Display elements in reverse order");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) 
	    {
                case 1: 
                    System.out.println("Enter the element to add:");
                    String element = sc.nextLine();
                    l.add(element);
                    System.out.println("Element added.");
                    break;

                case 2: 
                    if (l.isEmpty()) 
		    {
                        System.out.println("The list is empty. Nothing to delete.");
                    } 
		    else 
		    {
                        System.out.println("Enter the element to delete:");
                        String delElement = sc.nextLine();
                        if (l.remove(delElement)) 
			{
                            System.out.println("Element deleted.");
                        } 
			else 
			{
                            System.out.println("Element not found in the list.");
                        }
                    }
                    break;

                case 3: 
                    if (l.isEmpty()) 
		    {
                        System.out.println("The list is empty.");
                    } 
		    else 
		    {
                        System.out.println("Elements in reverse order:");
                        ListIterator<String> iterator = l.listIterator(l.size());
                        while (iterator.hasPrevious()) 
			{
                            System.out.println(iterator.previous());
                        }
                    }
                    break;

                case 4: 
                    System.out.println("Exiting the program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}



