import java.sql.*;

public class Q5 {
    public static void main(String args[]) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        PreparedStatement ps = null;

        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver Loaded Successfully");

            con = DriverManager.getConnection("jdbc:postgresql:amresh", "postgres", "8624807723");
            if (con == null)
                System.out.println("Connection failed");
            else
                System.out.println("Connection Established successfully");

            st = con.createStatement();

            // Use executeUpdate() instead of executeQuery()
            st.executeUpdate("create table if not exists projectt(pid int primary key , pname text, pdesc text, pstatus text);");
            System.out.println("Created table project");

            ps = con.prepareStatement("insert into projectt values(?,?,?,?)");
            ps.setInt(1, 1);
            ps.setString(2, "Java");
            ps.setString(3, "Subject");
            ps.setString(4, "Active");  // Providing value for pstatus
            ps.executeUpdate();
            System.out.println("Inserted");

            rs = st.executeQuery("select * from projectt");
            System.out.println("pid \t pname \t pdesc \t pstatus ");
            while (rs.next()) {
                System.out.println(" " + rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
