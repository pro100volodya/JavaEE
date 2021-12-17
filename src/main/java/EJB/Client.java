package EJB;

import lombok.Data;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import java.io.Serializable;

@Stateless
@Data
public class Client implements Serializable {
    String startTravelMonth;
    String fullName;
    int age;
    int amountOfPeopleForTravel;
    @Resource(name = "currencyEntry")
    int travelBudgetInDollars;

    public Client(String fullName, int age, int travelBudgetInDollars, int amountOfPeopleForTravel) {
        this.fullName = fullName;
        this.age = age;
        this.amountOfPeopleForTravel = amountOfPeopleForTravel;
        this.travelBudgetInDollars = travelBudgetInDollars;
    }
}
