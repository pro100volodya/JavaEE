package Servlet;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "TravelAgencyServlet", urlPatterns = {"/travel"})
public class TravelAgencyServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String startTrip = request.getParameter("startTrip");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html><body>");
        printWriter.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        try (PrintWriter writer = response.getWriter()) {
            String name = request.getParameter("username");
            String age = request.getParameter("userage");
            String price = request.getParameter("userprice");
            String gender = request.getParameter("gender");
            String country = request.getParameter("country");
            writer.println("<p>Full name: " + name + "</p>");
            writer.println("<p>Age: " + age + "</p>");
            writer.println("<p>Price: " + price + "</p>");
            writer.println("<p>Gender: " + gender + "</p>");
            writer.println("<p>Country: " + country + "</p>");
        }
    }
}