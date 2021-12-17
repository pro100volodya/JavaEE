package CDI;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TravelAgencyServletN", urlPatterns = {"/travelN"})
public class TravelAgencyServletN extends HttpServlet {

    @Inject
    TravelAgency travelAgency;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher dispatcher = req.getRequestDispatcher("lab2.jsp");
        dispatcher.forward(req, resp);
    }
}

