package EJB;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TravelAgencyServlet", urlPatterns = {"/travelAgency"})
public class TravelAgencyServlet extends HttpServlet {

    @EJB
    ITDepartment itDepartment;

    @EJB
    InsuranceDepartment insuranceDepartment;

    @EJB
    PRDepartment prDepartment;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        itDepartment.printInfo();

        insuranceDepartment.printInfo();

        prDepartment.printAllClients();
    }
}
