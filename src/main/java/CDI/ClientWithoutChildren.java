package CDI;


import javax.enterprise.context.RequestScoped;

@RequestScoped
@ClientWithoutChildrenAnnotation
public class ClientWithoutChildren extends Client {

    public ClientWithoutChildren() {
    }

    public ClientWithoutChildren(String fullNameOfClient, int amountOfPeople) {
        super(fullNameOfClient, amountOfPeople);
    }

    @Override
    public String printInfo() {
        return "Trip will be without children";
    }

    public void methodDispose() {
        System.out.println("We will be glad to see you again");
    }
}
