/*import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class c1 extends JFrame {
    private HashMap<String, String> stdCodes;
    private JTextField cityField, codeField;
    private JTextArea displayArea;

    public c1() {
        // Initialize HashMap to store city-code pairs
        stdCodes = new HashMap<>();

        // Set up the frame
        setTitle("City STD Code Directory");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Create input panel
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Add components to input panel
        inputPanel.add(new JLabel("City Name:"));
        cityField = new JTextField();
        inputPanel.add(cityField);

        inputPanel.add(new JLabel("STD Code:"));
        codeField = new JTextField();
        inputPanel.add(codeField);

        // Create button panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        
        JButton addButton = new JButton("Add City");
        JButton removeButton = new JButton("Remove City");
        JButton searchButton = new JButton("Search City");
        JButton displayButton = new JButton("Display All");

        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);
        buttonPanel.add(searchButton);
        buttonPanel.add(displayButton);

        inputPanel.add(new JLabel("")); // Spacer
        inputPanel.add(buttonPanel);

        // Create display area
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Results"));

        // Add panels to frame
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // Add Button Listeners
        addButton.addActionListener(e -> addCity());
        removeButton.addActionListener(e -> removeCity());
        searchButton.addActionListener(e -> searchCity());
        displayButton.addActionListener(e -> displayAll());

        // Center the frame on screen
        setLocationRelativeTo(null);
    }

    private void addCity() {
        String city = cityField.getText().trim();
        String code = codeField.getText().trim();

        if (city.isEmpty() || code.isEmpty()) {
            JOptionPane.showMessageDialog(this,  "Please enter both city name and STD code", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (stdCodes.containsKey(city)) {
            JOptionPane.showMessageDialog(this, "City already exists!", "Duplicate Entry",JOptionPane.WARNING_MESSAGE);
            return;
        }

        stdCodes.put(city, code);
        displayArea.setText("Added: " + city + " with STD code: " + code);
        clearFields();
    }

    private void removeCity() {
        String city = cityField.getText().trim();

        if (city.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a city name to remove", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (stdCodes.remove(city) != null) {
            displayArea.setText("Removed city: " + city);
        } else {
            displayArea.setText("City not found: " + city);
        }
        clearFields();
    }

    private void searchCity() {
        String city = cityField.getText().trim();

        if (city.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a city name to search", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String code = stdCodes.get(city);
        if (code != null) {
            displayArea.setText("Found: " + city + "\nSTD Code: " + code);
        } else {
            displayArea.setText("City not found: " + city);
        }
    }

    private void displayAll() {
        if (stdCodes.isEmpty()) {
            displayArea.setText("No cities in directory");
            return;
        }

        StringBuilder sb = new StringBuilder("City STD Directory:\n\n");
        for (String city : stdCodes.keySet()) {
            sb.append(String.format("%-20s : %s%n", city, stdCodes.get(city)));
        }
        displayArea.setText(sb.toString());
    }

    private void clearFields() {
        cityField.setText("");
        codeField.setText("");
    }

    public static void main(String[] args) {
        // Run the application
        SwingUtilities.invokeLater(() -> {
            new c1().setVisible(true);
        });
    }
}*/


import java.util.HashMap;
import java.util.Scanner;

public class c1 {
    private static HashMap<String, String> stdCodes = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = getChoice();

            switch (choice) {
                case 1:
                    addCity();
                    break;
                case 2:
                    removeCity();
                    break;
                case 3:
                    searchCity();
                    break;
                case 4:
                    displayAll();
                    break;
                case 5:
                    System.out.println("Thank you for using the STD Code Directory!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n=== City STD Code Directory ===");
        System.out.println("1. Add City");
        System.out.println("2. Remove City");
        System.out.println("3. Search City");
        System.out.println("4. Display All");
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

    private static void addCity() {
        System.out.print("Enter city name: ");
        String city = scanner.nextLine().trim();

        if (city.isEmpty()) {
            System.out.println("City name cannot be empty!");
            return;
        }

        if (stdCodes.containsKey(city)) {
            System.out.println("City already exists!");
            return;
        }

        System.out.print("Enter STD code: ");
        String code = scanner.nextLine().trim();

        if (code.isEmpty()) {
            System.out.println("STD code cannot be empty!");
            return;
        }

        stdCodes.put(city, code);
        System.out.println("Added: " + city + " with STD code: " + code);
    }

    private static void removeCity() {
        System.out.print("Enter city name to remove: ");
        String city = scanner.nextLine().trim();

        if (city.isEmpty()) {
            System.out.println("City name cannot be empty!");
            return;
        }

        if (stdCodes.remove(city) != null) {
            System.out.println("Removed city: " + city);
        } else {
            System.out.println("City not found: " + city);
        }
    }

    private static void searchCity() {
        System.out.print("Enter city name to search: ");
        String city = scanner.nextLine().trim();

        if (city.isEmpty()) {
            System.out.println("City name cannot be empty!");
            return;
        }

        String code = stdCodes.get(city);
        if (code != null) {
            System.out.println("Found: " + city);
            System.out.println("STD Code: " + code);
        } else {
            System.out.println("City not found: " + city);
        }
    }

    private static void displayAll() {
        if (stdCodes.isEmpty()) {
            System.out.println("No cities in directory");
            return;
        }

        System.out.println("\nCity STD Directory:");
        System.out.println("-------------------");
        for (String city : stdCodes.keySet()) {
            System.out.printf("%-20s : %s%n", city, stdCodes.get(city));
        }
    }
}
