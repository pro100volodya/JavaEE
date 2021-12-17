package Validation;

import lombok.SneakyThrows;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.*;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Set;

@WebServlet(name = "TravelAgencyServletValidation", urlPatterns = {"/travelV"})
public class TravelAgencyServletValidation extends HttpServlet {

    @Inject
    Client client;

    @Inject
    Validator validator;


    @SneakyThrows
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        client.fullName = "Boyko Volodymyr";
        client.age = 16;

        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<Client>> validate = validator.validate(client);

        if (validate.size() > 0) {
            System.out.println("Some error occurred");
        }
        for (ConstraintViolation violation : validate) {
            System.out.println(violation.getMessage());
            System.out.println("Invalid value: " + violation.getInvalidValue());
        }

        Set<ConstraintViolation<Client>> fullName = validator.validateProperty(client, "fullName");
        if (fullName.size() > 0) {
            System.out.println("Full name is wrong");
        }

        Set<ConstraintViolation<Client>> age = validator.validateValue(Client.class, "age", "10");
        if (age.size() > 0) {
            System.out.println("Age is less than 18");
        }

        Set<ConstraintViolation<Client>> correctEmail = validator.validateValue(Client.class, "email", "myemail@gmail.com");
        for (ConstraintViolation violation : correctEmail) {
            System.out.println(violation.getMessage());
            System.out.println("Invalid value: " + violation.getInvalidValue());
        }

        Set<ConstraintViolation<Client>> incorrectEmail = validator.validateValue(Client.class, "email", "myemail@gmail.ua");
        for (ConstraintViolation violation : incorrectEmail) {
            System.out.println(violation.getMessage());
            System.out.println("Invalid value: " + violation.getInvalidValue());
        }

        client.setStartTourDate(LocalDate.of(2021, 11, 26));
        client.setEndTourDate(LocalDate.of(2001, 11, 9));
        Set<ConstraintViolation<Client>> date = validator.validate(client);
        for (ConstraintViolation violation : date) {
            System.out.println(violation.getMessage());
            System.out.println("Invalid value: " + violation.getInvalidValue());
        }
        //validatorFactory.close();
    }
}

