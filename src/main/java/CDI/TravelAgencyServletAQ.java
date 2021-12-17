package CDI;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TravelAgencyServletAQ", urlPatterns = {"/travelAQ"})
public class TravelAgencyServletAQ extends HttpServlet {

    @Inject
    @ClientWithoutChildrenAnnotation
    Information info;

    @Inject
    @Alternative
    Information info2;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(info.printInfo());
        System.out.println(info2.printInfo());
    }
}
