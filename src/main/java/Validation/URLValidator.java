package Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class URLValidator implements ConstraintValidator<URL, Client> {
    String protocol;
    String host;

    @Override
    public void initialize(URL url) {
        protocol = url.protocol();
        host = url.host();
    }

    @Override
    public boolean isValid(Client client, ConstraintValidatorContext constraintValidatorContext) {
        if (protocol != null && protocol.length() > 0) {
            constraintValidatorContext.disableDefaultConstraintViolation();
            constraintValidatorContext.buildConstraintViolationWithTemplate("Invalid protocol").addConstraintViolation();
            return false;
        }
        if (host != null && host.length() > 0) {
            constraintValidatorContext.disableDefaultConstraintViolation();
            constraintValidatorContext.buildConstraintViolationWithTemplate("Invalid host").addConstraintViolation();
            return false;
        }
        return true;
    }
}
