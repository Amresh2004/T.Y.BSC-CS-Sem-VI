import java.sql.*;
public class Q1 {
    public static void main(String[] args) throws SQLException {
        Connection conn;
        try
        {
            Class.forName("org.postgresql.Driver");
            System.out.println("Connecting to database...");
            conn=DriverManager.getConnection("jdbc:postgresql://localhost/amresh","postgres","8624807723");
            if(conn!=null)
            {
                System.out.println("Connected");
            }
            else
            {
                System.out.println("Not Connected");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// "C:\Program Files\Java\jdk-22\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.2.1\lib\idea_rt.jar=54869:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\amres\IdeaProjects\javaproject\out\production\javaproject;C:\Users\amres\Downloads\postgresql-42.2.29.jre7.jar Q1
// Connecting to database...
// Connected

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