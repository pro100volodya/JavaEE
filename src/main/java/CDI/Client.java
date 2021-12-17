package CDI;

import lombok.Data;


@Data
public abstract class Client implements Information {
    private String fullNameOfClient;
    private int amountOfPeople;

    public Client(){}
    public Client(String fullNameOfClient, int amountOfPeople) {
        this.fullNameOfClient = fullNameOfClient;
        this.amountOfPeople = amountOfPeople;
    }

    protected abstract void methodDispose();
}
