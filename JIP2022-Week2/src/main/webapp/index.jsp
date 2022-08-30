<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="hello-servlet" method="get">
<%--    Enter name: <input type="text" name="name"><br>--%>
<%--    Enter surname: <input type="text" name="surname"><br>--%>
<%--    Enter school: <input type="text" name="school"><br>--%>
    Enter name: <input type="text" name="page">
    <input type="submit" value="Done">
</form><br>
    <a href="origin-servlet">Origin Servet</a><br>
    <a href="destination-servlet">Destination Servet</a><br>
    <a href="FilterEx">Filter Servet</a><br>
    <a href="session.jsp">Create Session</a>
</body>
</html>