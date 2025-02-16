<%@ page language="java" import="java.util.*" %>
<html>
<head>
<title> PRIME Demo </title>
</head>
<body text="green">
<%
try
{
 int x=Integer.parseInt(request.getParameter("n"));
 int i,flag=1;
 for(i=2;i<x;i++)
 {
    if(x%i==0)
    {
    flag++;
    break;
    }
    }
    if(flag==1)
    out.print("Number is Prime");
    else
    out.print("Number is not Prime");
   }
   catch (Exception e)
    {
    out.print(e);
    }

   %>
   </body>
   </html>