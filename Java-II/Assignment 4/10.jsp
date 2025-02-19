<html>
    <body>
        <form method="POST" action="">
            Enter String <input type="text" name="txt" > <br>
            <input type="submit" value="REverse String" />
        </form>
        <%
        try
        {
            String s= request.getParameter("txt");
            StringBuffer sb=new StringBuffer(s);
            out.print("Reverse String is: "+sb.reverse());
        }
        catch (Exception e)
        {
            out.print(e);
        }
        %>
    </body>
</html>