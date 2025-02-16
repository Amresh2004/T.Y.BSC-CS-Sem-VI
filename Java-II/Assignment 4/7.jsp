<%@ page language="java" import="java.util.*" %>
<html>
<head>
<title> Number Demo </title>
</head>
<body text="red">
<%
try
{
 int x=Integer.parseInt(request.getParameter("n"));
 int r=0,l=0;
while(x>0)
{
l=x%10;
r=r*10+l;
x=x/10;
}

while(r!=0)
{
l=r%10;
r=r/10;
switch(l)
{
case 0:out.print("ZERO\t");
break;
case 1:out.print("ONE\t");
 break;
case 2:out.print("TWO\t");
 break;
case 3:out.print("THREE\t");
 break;
case 4:out.print("FOUR\t");
 break;
case 5:out.print("FIVE\t");
 break;
case 6:out.print("SIX\t");
 break;
case 7:out.print("SEVEN\t");
 break;
case 8:out.print("EIGHT\t");
 break;
case 9:out.print("NINE\t");
 break;
}
}
}
catch (Exception e)
 {
 out.print(e);
 }
%>
</body>
</html>
