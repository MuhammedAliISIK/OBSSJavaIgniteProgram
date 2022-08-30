package tr.com.obss.jip.jip2022week2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "createSession", value = "/create-session")
public class CreateSession extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String uname = req.getParameter("userName");
        String id = req.getParameter("id");
//        req.getSession(true);
        req.getSession().setAttribute("username", uname);
        req.getSession().setAttribute("id",id);
        RequestDispatcher rd = req.getRequestDispatcher("list-session-attributes");
        rd.forward(req,resp);
//        resp.sendRedirect("list-destination-servlet");
//        resp.sendRedirect("invalidate-session");
    }
}