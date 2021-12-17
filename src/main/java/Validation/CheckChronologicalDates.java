package Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckChronologicalDates implements ConstraintValidator<ChronologicalDates, Client> {

    @Override
    public void initialize(ChronologicalDates chronologicalDates) {
    }

    @Override
    public boolean isValid(Client client, ConstraintValidatorContext constraintValidatorContext) {
        return client.startTourDate.isBefore(client.endTourDate);
    }
}
