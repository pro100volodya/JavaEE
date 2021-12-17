package Validation;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@URL(protocol = "http", host = "https://joinup.ua/uk/")
@ChronologicalDates
public class Client {
    @NotNull(message = "Full name cannot be null")
    String fullName;
    @Min(18)
    int age;


    @Pattern.List({
            @Pattern(regexp = "[C,D,M][A-Z][0-9]*"),
            @Pattern(regexp = ".[A-Z].*?")
    })
    private String orderId;

    LocalDate startTourDate;
    LocalDate endTourDate;

    @CheckEmail
    String email;

    @NotNull
    public String getFullName() {
        return fullName;
    }

    public void setFullName(@NotNull String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getStartTourDate() {
        return startTourDate;
    }

    public void setStartTourDate(LocalDate startTourDate) {
        this.startTourDate = startTourDate;
    }

    public LocalDate getEndTourDate() {
        return endTourDate;
    }

    public void setEndTourDate(LocalDate endTourDate) {
        this.endTourDate = endTourDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
