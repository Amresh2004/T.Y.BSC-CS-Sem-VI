
import java.sql.*;
class JDBCDEmo2
{
    public static void main(String args[]) throws SQLException
    {
        Connection con =null;
        Statement st =null;
        ResultSet rs =null;
        try
        {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver Loaded Successfully");
            con=DriverManager.getConnection("jdbc:postgresql:amresh","postgres","8624807723"); //step3:: Create the connection
            if(con==null)
                System.out.println("failed");
            else
                System.out.println("Connection Established successfully");
            st = con.createStatement();
            rs = st.executeQuery("select rno from students");
            System.out.println("Roll No");
            while(rs.next())
            {
                System.out.println(" "+rs.getInt(1));
            }

            rs = st.executeQuery("select rno,name from students where name ILIKE 'amresh'");

            System.out.println("Roll No \t Name ");
            while(rs.next())
            {
                System.out.println(""+rs.getInt(1)+"\t"+rs.getString(2));
            }

            rs=st.executeQuery("SELECT rno, name, address FROM students WHERE rno = 2 AND name = 'Shubham'");
                    System.out.println("Roll No \t Name \t Address");
            while(rs.next())
            {
                System.out.println(""+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
            }

            int rowsAffected = st.executeUpdate("delete from students where name = 'Mitesh'");
            System.out.println("Rows affected: " + rowsAffected);

        }
        catch(Exception e)
        {
            System.out.println("Error"+e);
        }
    }
}

// "C:\Program Files\Java\jdk-22\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.2.1\lib\idea_rt.jar=54808:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\amres\IdeaProjects\javaproject\out\production\javaproject;C:\Users\amres\Downloads\postgresql-42.2.29.jre7.jar JDBCDEmo2
// Driver Loaded Successfully
// Connection Established successfully
// Roll No
//  1
//  2
// Roll No 	 Name 
// 1	Amresh
// Roll No 	 Name 	 Address
// 2	Shubham	456 Elm St
// Rows affected: 0

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
