package CDI;

import javax.enterprise.event.Event;
import javax.inject.Inject;

public class FlightService {
    @Inject
    Event<Flight> event;

    public void addFlight(Flight flight) {
        System.out.println(flight.getDate() + " ,new date was added");
        event.fire(flight);
    }
}
