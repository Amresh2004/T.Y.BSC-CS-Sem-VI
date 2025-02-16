<%@ page language="java" import="java.util.*" %>
<html>
    <head>
        <title> SUM OF FIRST & LAST DIGIT </title>
        </head>
        <body text="red">
        <%
        try
        {
         int x=Integer.parseInt(request.getParameter("n"));
         int l;
         l=x%10;
         while(x >10)
         {
         x=x/10;
         }
         out.print("Sum of first and last digit is:: " +(l+x));
        }
        catch (Exception e)
        {
         out.print(e);
        }
        %>
        </body>
        </html>
        