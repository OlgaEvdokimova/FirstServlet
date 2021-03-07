<%@ page import="testClass.Cart" %><%--
  Created by IntelliJ IDEA.
  User: Ольга
  Date: 07.03.2021
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Cart</title>
</head>
<body>
<%
    Cart cart = (Cart) session.getAttribute("cart");
%>
<p>Name <%= cart.getName() %></p>
<p>Quantity<%= cart.getQuantity()%></p>
</body>
</html>
