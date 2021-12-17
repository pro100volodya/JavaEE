package CDI;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TravelAgencyServletInterceptors", urlPatterns = {"/travelI"})
public class TravelAgencyServletInterceptors extends HttpServlet {
    @Inject
    Flight flight;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        flight.checkIn();
    }
}
