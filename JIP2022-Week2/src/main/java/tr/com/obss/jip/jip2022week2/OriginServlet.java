package tr.com.obss.jip.jip2022week2;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "originServlet", value = "/origin-servlet")
public class OriginServlet extends HttpServlet {
    RequestDispatcher rd;

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setAttribute("forward","Forward Successful");

        rd = req.getRequestDispatcher("destination-servlet");
        rd.forward(req,res);

//        req.getServletContext().setAttribute("context","No Context");
//        res.sendRedirect("destination-servlet");

    }
}
