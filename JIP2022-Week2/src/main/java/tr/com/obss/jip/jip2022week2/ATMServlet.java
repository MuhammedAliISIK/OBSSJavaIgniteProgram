package tr.com.obss.jip.jip2022week2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name ="atmServlet", value = "/atm-servlet")
public class ATMServlet extends HttpServlet {
    int balance = 5000;
    String act;
    private Object lock = new Object();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException,NullPointerException {
        response.setContentType("text/html");

        synchronized(lock){
            response.setContentType("text/html");
            act = request.getParameter("act");
            if(act.equals("Deposit")){
                try {
                    Thread.sleep(5000);
                }catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                balance += Integer.parseInt(request.getParameter("deposit"));
                PrintWriter out = response.getWriter();
                out.println("<html><body>");
                out.println("<b>New Balance: " + balance);
                out.println("</body></html>");
            }
            else if(act.equals("Withdraw")){
                try {
                    Thread.sleep(5000);
                }catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                balance -= Integer.parseInt(request.getParameter("withdraw"));
                PrintWriter out = response.getWriter();
                out.println("<html><body>");
                out.println("<b>New Balance: " + balance);
                out.println("</body></html>");
            }
            else if(act.equals("Check Balance")){
                try {
                    Thread.sleep(5000);
                }catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                PrintWriter out = response.getWriter();
                out.println("<html><body>");
                out.println("<b>Balance: " + balance);
                out.println("</body></html>");
            }
        }


    }
}
