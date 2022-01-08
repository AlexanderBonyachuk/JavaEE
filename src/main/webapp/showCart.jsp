<%--
  Created by IntelliJ IDEA.
  User: sprin
  Date: 08.01.2022
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
    <%@ page import="CartPocket.Cart" %>
    <% Cart cart = (Cart) session.getAttribute("cart"); %>

    <p> Notation: <%= cart.getName() %> </p>
    <p> Quantity: <%= cart.getQuantity() %> </p>
</body>
</html>
