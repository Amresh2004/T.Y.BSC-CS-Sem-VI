<%@page language="java" import="java.util.*" %>
<html>
<head>
<title> JSP Number Demo </title>
</head>
<body>
<form method="GET" action="first.jsp">
Enter a number <input type="text" name="n" > <br>
<input type="submit" value="Display" /><br>
<%
try
{
 out.print (" Entered Number is:: "+Integer.parseInt(request.getParameter("n")));
}
catch (Exception e)
 {
 out.print(e);
 }
%>
</body>
</html>