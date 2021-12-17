package CDI;

import javax.interceptor.Interceptors;

@Interceptors(Interceptor.class)
public class Flight {

    String date;

    public Flight(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Flight() {
        System.out.println("Flight");
    }

    public void checkIn() {
        System.out.println("Check in");
    }
}
