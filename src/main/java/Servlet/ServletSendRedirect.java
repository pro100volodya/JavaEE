package Servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletSendRedicted", value = "/sendRedirect")
public class ServletSendRedirect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String startTrip = request.getParameter("startTrip");
        if (startTrip == null) {
            String path = request.getContextPath() + "/error";
            response.sendRedirect(path);
        } else {
            response.setContentType("text/html");
            try (PrintWriter writer = response.getWriter()) {
                writer.println("<h2>startTrip: " + startTrip + "</h2>");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
