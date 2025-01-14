import java.io.*;
import java.util.*;

public class c3{
    private static List<String> lines = new ArrayList<>();
    private static String filename;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a filename as command line argument");
            return;
        }

        filename = args[0];
        
        // Read file into list
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        while (true) {
            displayMenu();
            int choice = getChoice();
            
            switch (choice) {
                case 1:
                    insertLine();
                    break;
                case 2:
                    deleteLine();
                    break;
                case 3:
                    appendLine();
                    break;
                case 4:
                    modifyLine();
                    break;
                case 5:
                    saveAndExit();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            
            // Display current content
            displayContent();
        }
    }

    private static void displayMenu() {
        System.out.println("\n=== Text File Editor ===");
        System.out.println("1. Insert line");
        System.out.println("2. Delete line");
        System.out.println("3. Append line");
        System.out.println("4. Modify line");
        System.out.println("5. Exit");
        System.out.print("Enter your choice (1-5): ");
    }

    private static int getChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private static void displayContent() {
        System.out.println("\nCurrent file content:");
        System.out.println("--------------------");
        for (int i = 0; i < lines.size(); i++) {
            System.out.printf("%d: %s%n", i + 1, lines.get(i));
        }
    }

    private static void insertLine() {
        System.out.print("Enter line number to insert at: ");
        try {
            int position = Integer.parseInt(scanner.nextLine()) - 1;
            if (position < 0 || position > lines.size()) {
                System.out.println("Invalid line number!");
                return;
            }
            
            System.out.print("Enter text to insert: ");
            String text = scanner.nextLine();
            lines.add(position, text);
            System.out.println("Line inserted successfully.");
            
        } catch (NumberFormatException e) {
            System.out.println("Invalid line number!");
        }
    }

    private static void deleteLine() {
        System.out.print("Enter line number to delete: ");
        try {
            int position = Integer.parseInt(scanner.nextLine()) - 1;
            if (position < 0 || position >= lines.size()) {
                System.out.println("Invalid line number!");
                return;
            }
            
            lines.remove(position);
            System.out.println("Line deleted successfully.");
            
        } catch (NumberFormatException e) {
            System.out.println("Invalid line number!");
        }
    }

    private static void appendLine() {
        System.out.print("Enter text to append: ");
        String text = scanner.nextLine();
        lines.add(text);
        System.out.println("Line appended successfully.");
    }

    private static void modifyLine() {
        System.out.print("Enter line number to modify: ");
        try {
            int position = Integer.parseInt(scanner.nextLine()) - 1;
            if (position < 0 || position >= lines.size()) {
                System.out.println("Invalid line number!");
                return;
            }
            
            System.out.print("Enter new text: ");
            String text = scanner.nextLine();
            lines.set(position, text);
            System.out.println("Line modified successfully.");
            
        } catch (NumberFormatException e) {
            System.out.println("Invalid line number!");
        }
    }

    private static void saveAndExit() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }
}
