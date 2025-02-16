<%@page language="java" import="java.util.*" %>
<html>
<head>
    <title>JSP First Page</title>
</head>
<body>
    <h2>Processing Your Input</h2>
    <%
        try {
            String numStr = request.getParameter("n");
            if (numStr != null && !numStr.trim().isEmpty()) {
                int number = Integer.parseInt(numStr);
                out.print("<p>The entered number is: " + number + "</p>");
            } else {
                out.print("<p>No number was entered.</p>");
            }
        } catch (NumberFormatException e) {
            out.print("<p>Invalid number entered. Please enter a valid integer.</p>");
        }
    %>
    <br>
    <a href="3.jsp">Go Back</a>
</body>
</html>
