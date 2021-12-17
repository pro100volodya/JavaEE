package Servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletSession", value = "/session")
public class ServletSession extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String tourOperator = (String) session.getAttribute("tourOperator");
        try (PrintWriter out = response.getWriter()) {
            if (tourOperator == null) {
                session.setAttribute("tourOperator", "JoinUp");
                out.println("Session data is set");
            } else {
                out.println("tourOperator: " + tourOperator);
                session.removeAttribute("tourOperator");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
