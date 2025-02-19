<%@ page language="java" import="java.sql.*" %>
<html>
    <body>
        <%
        try{
            Connection con = null;
            Class.forName("org.postgresql.Driver");
            out.print("Driver Loaded Successfully<br>");

            con = DriverManager.getConnection("jdbc:postgresql:amresh", "postgres", "8624807723");
            if (con == null)
                out.print("Connection failed");
            else
                out.print("Connection Established successfully");
            }
        catch (Exception e)
        {
            out.print(e);
        }
        %>
    </body>
</html>