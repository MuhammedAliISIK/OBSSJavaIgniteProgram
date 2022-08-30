<%--
  Created by IntelliJ IDEA.
  User: muham
  Date: 26.07.2022
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ATM</title>
</head>
<body>
    <form action="atm-servlet" method = "get">
        Enter amount: <input type="text" name="deposit">
        <input type="submit" name="act" value="Deposit">
    </form>

    <form action="atm-servlet" method = "get">
        Enter amount: <input type="text" name="withdraw">
        <input type="submit" name="act" value="Withdraw">
    </form>
    <form action="atm-servlet" method = "get">
        <input type="submit" name="act" value="Check Balance">
    </form>

</body>
</html>
