package CDI;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named()
@RequestScoped
public class TravelAgency {

    @Produces
    private String name = "JoinUp";
    @Produces
    private int age = 16;

    List<Flight> list = new ArrayList<>();

    public void add(@Observes Flight flight) {
        System.out.println(flight.getDate() + " ,new date added to list");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
