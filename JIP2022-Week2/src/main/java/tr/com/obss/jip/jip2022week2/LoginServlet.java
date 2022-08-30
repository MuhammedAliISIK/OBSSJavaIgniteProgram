package tr.com.obss.jip.jip2022week2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "loginServlet", value = "/login-servlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        System.out.println("deneme");
        String username = req.getParameter("username");
        String password = req.getParameter("pass");

        if(username.equals("admin") && password.equals("1234")){
            req.getSession().setAttribute("isLoggedIn",true);
            PrintWriter out = resp.getWriter();
            resp.sendRedirect("private/secured.jsp");
        }
        else{
            req.getSession().setAttribute("isLoggedIn",false);
            resp.sendRedirect("login.jsp");
        }
    }
}
