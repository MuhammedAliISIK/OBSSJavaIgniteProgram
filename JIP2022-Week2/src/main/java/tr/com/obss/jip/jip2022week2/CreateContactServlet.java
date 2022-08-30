package tr.com.obss.jip.jip2022week2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "createContactServlet", value = "/create-contact-servlet")
public class CreateContactServlet extends HttpServlet {
    private Connection conn;
    private Statement st;
    private ResultSet rs;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactdb","root","1234");
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM contacts");
            while(rs.next()){
                pw.println(rs.getString(1)+"  "+rs.getInt(2));
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
