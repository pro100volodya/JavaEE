package EJB;

import javax.annotation.Resource;
import javax.ejb.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Stateful
@AccessTimeout(value = 30, unit = TimeUnit.SECONDS)
@Lock(LockType.WRITE)
public class PRDepartment extends TravelAgency {

    @Resource
    private SessionContext sessionContext;

    public PRDepartment() {
    }

    public PRDepartment(String name, List<Client> clientList) {
        super(name, clientList);
    }

    @Schedule(dayOfMonth = "11", hour = "11", minute = "22")
    @Lock(LockType.READ)
    public void printAllClients() {
        if (!sessionContext.isCallerInRole("admin")) {
            throw new SecurityException("admins only");
        }
        System.out.println("List of clients: ");
        clientList.forEach(System.out::println);
    }

}
