/*import java.\.*;
import java.util.concurrent.*;

class FileSearchTask implements Runnable {
    private File file;
    private String searchString;

    public FileSearchTask(File file, String searchString) {
        this.file = file;
        this.searchString = searchString;
    }

    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int lineNumber = 0;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (line.contains(searchString)) {
                    System.out.println("Found in " + file.getName() + " at line " + lineNumber + ": " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file " + file.getName() + ": " + e.getMessage());
        }
    }
}

public class setb2 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java SimpleSearchEngine <search_string>");
            return;
        }

        String searchString = args[0];
        File currentDir = new File(".");
  
  	File[] files = currentDir.listFiles((dir, name)*/


import java.io.*;
import java.util.*;

class FileSearcher extends Thread {
    private File file;
    private String searchString;

    public FileSearcher(File file, String searchString) {
        this.file = file;
        this.searchString = searchString;
    }

    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int lineNumber = 0;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (line.contains(searchString)) {
                    System.out.println("Found in " + file.getName() + " at line " + lineNumber + ": " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + file.getName());
        }
    }
}

public class setb2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string to search: ");
        String searchString = scanner.nextLine();
        scanner.close();

        File currentDirectory = new File(".");
        File[] files = currentDirectory.listFiles((dir, name) -> name.endsWith(".txt"));

        if (files != null && files.length > 0) {
            List<Thread> threads = new ArrayList<>();
            for (File file : files) {
                Thread thread = new FileSearcher(file, searchString);
                threads.add(thread);
                thread.start();
            }

            for (Thread thread : threads) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("No text files found in the current directory.");
        }
    }
}
