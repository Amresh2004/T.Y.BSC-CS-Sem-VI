import java.sql.*;
class Q4 {
    public static void main(String args[]) throws SQLException {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver Loaded Successfully");
            
            con = DriverManager.getConnection("jdbc:postgresql:amresh", "postgres", "8624807723");
            if (con == null)
                System.out.println("Connection failed");
            else
                System.out.println("Connection Established successfully");
            
            st = con.createStatement();
            
            int rowsUpdated = st.executeUpdate("UPDATE students SET name='Mitesh' WHERE rno=2");
            
            if (rowsUpdated > 0) {
                System.out.println("Record updated successfully. Rows affected: " + rowsUpdated);
            } else {
                System.out.println("No record found with rno = 3 to update.");
            }
            
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

// "C:\Program Files\Java\jdk-22\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.2.1\lib\idea_rt.jar=55268:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\amres\IdeaProjects\javaproject\out\production\javaproject;C:\Users\amres\Downloads\postgresql-42.2.29.jre7.jar Q4
// Driver Loaded Successfully
// Connection Established successfully
// Record updated successfully. Rows affected: 1

// Process finished with exit code 0

// CREATE TABLE students (
//     rno SERIAL PRIMARY KEY,     
//     name VARCHAR(100) NOT NULL, 
//     address TEXT                
// );

// INSERT INTO students (name, address) VALUES
// ('Amresh', '123 Main St'),
// ('Shubham', '456 Elm St'),
// ('Mitesh', '789 Oak St');

// SELECT rno FROM students;

// SELECT * FROM students;

// SELECT rno, name FROM students WHERE name = 'Amresh';


// SELECT * FROM students;
