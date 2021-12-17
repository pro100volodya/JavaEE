package CDI;

import javax.enterprise.inject.Disposes;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TravelAgencyServletRD", urlPatterns = {"/travelRD"})
public class TravelAgencyServletRD extends HttpServlet {
    @Inject
    String name;
    @Inject
    int age;

    public void methodDispose(@Disposes Client client) {
        client.methodDispose();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("Name of travel agency is " + name + "\nAge of travel agency is " + age);

    }
}
