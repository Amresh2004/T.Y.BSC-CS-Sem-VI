<%@ page language="java" import="java.util.*" %>
<html>
<head>
<title> Greetings!! </title>
</head>
<body text="red" >
<%
try
{
 String s= request.getParameter("txt");
 Date d=new Date();
 int t=d.getHours();
 if(t>0 && t<12)
 out.print("Good Morning!!\t" +s);
 else if(t>=12 && t<=16)
 out.print("Good Evening!!\t" +s);
 else
 out.print("Good Night!!\t" +s);
}
catch (Exception e)
 {
 out.print(e);
 }
 %>
</body>
</html>