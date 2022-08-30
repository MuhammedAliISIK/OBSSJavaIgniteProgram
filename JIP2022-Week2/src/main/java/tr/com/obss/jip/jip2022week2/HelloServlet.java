package tr.com.obss.jip.jip2022week2;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    String surname;
    public void init() {
        message = "Hello World!";
    }

//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");
//
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
//        out.println("</body></html>");
//    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        response.setContentType("text/html");
//        String name = request.getParameter("name");
//        String surname = request.getParameter("surname");
//        String school = request.getParameter("school");
//
//
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<b>Name: " + name + "</b><br>");
//        out.println("<b>Surname: " + surname + "</b><br>");
//        out.println("<b>School: " + school + "</b>");
//        out.println("</body></html>");

        String destination = request.getParameter("page")+".jsp";
        if(destination.equals("first.jsp") || destination.equals("second.jsp") || destination.equals("third.jsp") || destination.equals("backrooms.jsp")){
            RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
            requestDispatcher.forward(request, response);
        }
        else{
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            out.println("Wrong page name!");
            out.println("<br><a href = 'index.jsp'>Return to Main Page</a>");
        }

        System.out.println(request.getRequestURL().append("?").append(request.getQueryString()));
        if(request.getRequestURL().append("?").append(request.getQueryString()).toString().contains("secure")){
            response.sendError(HttpServletResponse.SC_FORBIDDEN);

        }



    }


}