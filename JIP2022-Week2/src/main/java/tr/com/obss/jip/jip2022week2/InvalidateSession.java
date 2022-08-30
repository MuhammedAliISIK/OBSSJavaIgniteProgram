package tr.com.obss.jip.jip2022week2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "invalidateSession", value = "/invalidate-session")
public class InvalidateSession extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().invalidate();
        req.getSession(true);

        PrintWriter out = resp.getWriter();
        if(!req.isRequestedSessionIdValid()){
            out.println("Invalid Session!");
        }

    }
}
