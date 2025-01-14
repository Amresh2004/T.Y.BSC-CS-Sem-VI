import java.util.*;
import java.io.*;

/*public class b3 {
    public static void main(String args[]) {
        try {
            // Create FileInputStream to read from the text file
            FileInputStream file = new FileInputStream("Details.txt");
            
            // Create Scanner to read from file, using tab as delimiter
            Scanner fileScanner = new Scanner(file).useDelimiter("\t");
            
            // Create Hashtable to store name-phone number pairs
            Hashtable<String, String> phoneBook = new Hashtable<>();
            
            // Read file line by line
            while(fileScanner.hasNext()) {
                // Read a line and split it by tab
                String line = fileScanner.nextLine();
                String[] parts = line.split("\t");
                
                // Store name and phone number in hashtable
                // parts[0] is name, parts[1] is phone number
                phoneBook.put(parts[0], parts[1]);
                
                // Optional: Print what was read
                System.out.println("Loaded: " + parts[0] + " - " + parts[1]);
            }
            
            // Create scanner for user input
            Scanner inputScanner = new Scanner(System.in);
            
            // Get name from user
            System.out.println("Enter a name to look up:");
            String searchName = inputScanner.nextLine();
            
            // Look up the name in hashtable
            if(phoneBook.containsKey(searchName)) {
                System.out.println("Phone number: " + phoneBook.get(searchName));
            } else {
                System.out.println("Name not found in directory.");
            }
            
            // Close the scanners
            fileScanner.close();
            inputScanner.close();
            
        } catch(FileNotFoundException e) {
            System.out.println("Error: File not found");
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}*/



/*import java.util.*;
import java.io.*;
class b3
{
        public static void main(String args[])
        {
                try
                {
                        FileInputStream f=new FileInputStream("Details.txt");
                        Scanner sc=new Scanner(f).useDelimiter("\t");
                        Hashtable h=new Hashtable();
                        String a[],a1,str;
                        while(sc.hasNext())
                        {
                                a1=sc.nextLine();
                                a=a1.split("\t");
                                h.put(a[0],a[1]);
                                System.out.println(a[0]);
                                System.out.println(a[1]);
                        }
                                Scanner s=new Scanner(System.in);
                                System.out.println("enter the name:");
                                str=s.next();
                                if(h.containsKey(str))
                                {
                                        System.out.println("phone no:"+h.get(str));
                                }
                                else
                                {
                                        System.out.println("name not found:");
                                }
                }
                catch(Exception e)
                { 
			System.out.println(e);
		}
	}
}
*/


/*
import java.util.*;
import java.io.*;

class b3 {
    public static void main(String args[]) {
        try {
            // Create FileInputStream to read from the text file
            FileInputStream file = new FileInputStream("Details.txt");

            // Create Scanner to read from file
            Scanner fileScanner = new Scanner(file);

            // Create Hashtable to store name-phone number pairs
            Hashtable<String, String> phoneBook = new Hashtable<>();

            // Read file line by line
            while(fileScanner.hasNextLine()) {
                // Read a line and split it by tab
                String line = fileScanner.nextLine().trim();

                // Check if line contains a tab
                if(line.contains("\t")) {
                    String[] parts = line.split("\t");

                    // Verify we have both name and phone number
                    if(parts.length == 2) {
                        // Store name and phone number in hashtable
                        phoneBook.put(parts[0], parts[1]);

                        // Print what was read
                        System.out.println("Loaded: " + parts[0] + " - " + parts[1]);
                    }
                }
            }

            // Create scanner for user input
            Scanner inputScanner = new Scanner(System.in);

            // Get name from user
            System.out.println("\nEnter a name to look up:");
            String searchName = inputScanner.nextLine();

            // Look up the name in hashtable
            if(phoneBook.containsKey(searchName)) {
                System.out.println("Phone number: " + phoneBook.get(searchName));
            } else {
                System.out.println("Name not found in directory.");
            }

            // Close the scanners
            fileScanner.close();
            inputScanner.close();

        } catch(FileNotFoundException e) {
            System.out.println("Error: File not found");
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}*/


import java.util.*;
import java.io.*;

class b3 {
    public static void main(String args[]) {
        try {
            FileInputStream file = new FileInputStream("Details.txt");
            Scanner fileScanner = new Scanner(file);
            Hashtable<String, String> phoneBook = new Hashtable<>();

            while(fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().trim();

                // Split by hyphen and trim spaces
                String[] parts = line.split("-");
                if(parts.length >= 2) {
                    // Get name (everything before the last three parts which form the phone number)
                    String name = parts[0].trim();

                    // Get phone number (combine the last three parts with hyphens)
                    String phoneNumber = "";
                    for(int i = 1; i < parts.length; i++) {
                        phoneNumber += parts[i].trim();
                        if(i < parts.length - 1) {
                            phoneNumber += "-";
                        }
                    }

                    // Store in hashtable
                    phoneBook.put(name, phoneNumber);
                    System.out.println("Loaded: " + name + " - " + phoneNumber);
                }
            }

            Scanner inputScanner = new Scanner(System.in);
            System.out.println("\nEnter a name to look up:");
            String searchName = inputScanner.nextLine();

            if(phoneBook.containsKey(searchName)) {
                System.out.println("Phone number: " + phoneBook.get(searchName));
            } else {
                System.out.println("Name not found in directory.");
            }

            fileScanner.close();
            inputScanner.close();

        } catch(FileNotFoundException e) {
            System.out.println("Error: File not found");
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
