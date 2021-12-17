package CDI;

import lombok.Data;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Alternative;
import javax.ws.rs.Produces;

@RequestScoped
@Data
@ClientWithChildrenAnnotation
@Alternative
public class ClientWithChildren extends Client {
    private int amountOfChildren;

    public ClientWithChildren() {
    }

    public ClientWithChildren(String fullNameOfClient, int amountOfPeople, int amountOfChildren) {
        super(fullNameOfClient, amountOfPeople);
        this.amountOfChildren = amountOfChildren;
    }

    @Produces
    Client getClient() {
        return new ClientWithChildren();
    }

    @Override
    public String printInfo() {
        return "Trip will be with children";
    }

    public void methodDispose() {
        System.out.println("We will be glad to see you again");
    }
}
