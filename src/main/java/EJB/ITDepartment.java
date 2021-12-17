package EJB;

import javax.ejb.Remote;
import javax.ejb.Schedule;
import javax.ejb.Schedules;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
@Remote(RemoteInformation.class)
public class ITDepartment extends TravelAgency implements RemoteInformation {
    public ITDepartment() {
    }

    public ITDepartment(String name, List<Client> clientList) {
        super(name, clientList);
    }

    @Schedules({
            @Schedule(minute = "*", persistent = false),
            @Schedule(hour = "11", dayOfWeek = "Wed")
    })
    @Override
    public void printInfo() {
        System.out.println("It is the best IT Department");
    }
}
