<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Ольга
  Date: 06.03.2021
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Servlet</title>
</head>
<body>
<h2>Hello world</h2>
<p>
    <%@page import="testClass.TestClass" %>

    <% TestClass testClass = new TestClass();%>
    <%= testClass.test()%>
        <%  Date now = new Date();

        String curDate = "Current Date " + now;
        %>
        <%= curDate%>


</p>
</body>
</html>
