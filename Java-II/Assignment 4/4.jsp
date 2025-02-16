<%@ page language="java" import="java.util.*" %>
<html>
<head>
<title> EVEN/ODD Demo </title>
</head>
<body text="red">
<%
try
{
 int x=Integer.parseInt(request.getParameter("n"));
 if(x%2==0)
 out.print ("Entered Number is EVEN ");
 else
 out.print("Enterd number is ODD");
}
catch (Exception e)
 {
 out.print(e);
 }
%>
</body>