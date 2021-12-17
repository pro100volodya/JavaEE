package EJB;

import javax.annotation.Resource;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.*;
import java.util.List;

@Singleton
@Local(LocalInformation.class)
@LocalBean
@RolesAllowed({"admin", "user"})
public class InsuranceDepartment extends TravelAgency implements LocalInformation {
    private final int insuranceOnEachClientInDollars = 10000;

    @Resource
    TimerService timerService;

    public InsuranceDepartment() {
    }

    public InsuranceDepartment(String name, List<Client> clientList) {
        super(name, clientList);
    }

    @RolesAllowed("admin")
    @Override
    public void printInfo() {
        System.out.println("Everyone our client insurance on " + insuranceOnEachClientInDollars + " dollars");
    }

    @PermitAll
    public void createInsuranceForClient(Client client) {
        ScheduleExpression startTravel = new ScheduleExpression().month(client.getStartTravelMonth());
        timerService.createCalendarTimer(startTravel, new TimerConfig(client, true));
    }


}
