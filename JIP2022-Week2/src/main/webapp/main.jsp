<%--
  Created by IntelliJ IDEA.
  User: muham
  Date: 27.07.2022
  Time: 13:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main</title>
</head>
<body>
    <h1>This is header page</h1>
    <%@ include file="header.jsp" %>
    <h1>End of header</h1>

    <h1>This is footer page</h1>
    <jsp:include page="footer.jsp" />
    <h1>End of footer</h1>
</body>
</html>
