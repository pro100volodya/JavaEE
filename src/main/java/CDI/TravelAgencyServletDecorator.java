package CDI;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TravelAgencyServletDecorator", urlPatterns = {"/travelD"})
public class TravelAgencyServletDecorator extends HttpServlet {
    @Inject
    Information information;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        information.printInfo();
    }
}
