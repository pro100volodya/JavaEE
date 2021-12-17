package EJB;

import java.util.*;

public abstract class TravelAgency {
    String name;
    List<Client> clientList = new ArrayList<>();

    public TravelAgency() {
    }

    public TravelAgency(String name, List<Client> clientList) {
        this.name = name;
        this.clientList = clientList;
    }

}
