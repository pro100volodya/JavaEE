package Validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Constraint(validatedBy = {CheckChronologicalDates.class})
@Target({TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ChronologicalDates {
    String message() default "javax.validation.constraints.Dates.message";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
