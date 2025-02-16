<%@ page language="java" import="java.util.*" %>
<html>
<head>
<title> Voter Demo </title>
</head>
<body text="green">
<%
try
{
 int x=Integer.parseInt(request.getParameter("n"));
 String s= request.getParameter("txt");
 if(x >=18 )
 out.print("Congradulations !!\t" +s+" you are eligible for Voting");
 else
 out.print("Sorry !!\t" +s+" you are not eligible for Voting");
}
catch (Exception e)
 {
 out.print(e);
 }
%>
</body>
</html>