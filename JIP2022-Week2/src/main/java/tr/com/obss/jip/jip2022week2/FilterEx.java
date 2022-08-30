package tr.com.obss.jip.jip2022week2;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "FilterEx", value = "/private/*")
public class FilterEx implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        HttpSession session = httpServletRequest.getSession();
        Boolean check = (Boolean) session.getAttribute("isLoggedIn");

        if(Boolean.TRUE.equals(check)){
            filterChain.doFilter(servletRequest, servletResponse);

        }
        else {
            httpServletResponse.sendRedirect("login.jsp");
        }
    }
}

