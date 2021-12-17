package CDI;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TravelAgencyServletObserves", urlPatterns = {"/travelO"})
public class TravelAgencyServletObserves extends HttpServlet {
    @Inject
    FlightService flightService;
    @Inject
    TravelAgency travelAgency;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        flightService.addFlight(new Flight("22.10.2021"));
        resp.getWriter().write(travelAgency.list.size());
    }
}
