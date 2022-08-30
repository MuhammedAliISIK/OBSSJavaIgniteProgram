<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<%--    <%--%>
<%--        Connection conn;--%>
<%--        Statement st;--%>
<%--        ResultSet rs;--%>
<%--        try{--%>
<%--            conn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/week2","root","1234");--%>
<%--            st = conn.createStatement();--%>
<%--            rs = st.executeQuery("SELECT * FROM contacts");--%>
<%--            while(rs.next()){--%>
<%--             %>--%>
<%--            asdas--%>
<%--                <%=rs.getString("name")%><br/>--%>
<%--                <%=rs.getInt("tel_number")%>--%>
<%--            <%--%>
<%--            }--%>
<%--                    System.out.println("31");--%>
<%--        conn.close();--%>
<%--        }catch(Exception e){--%>
<%--            e.printStackTrace();--%>
<%--        }--%>
<%--    %>--%>
<form action="create-contact-servlet" method="get">
    <input type="submit" value="Done">
</form>
</body>
</html>