package CDI;

import javax.decorator.Delegate;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

@Alternative
@javax.decorator.Decorator
public class Decorator implements Information {

    @Inject
    @Delegate
    Information information;

    @Override
    public String printInfo() {
        return information.printInfo();
    }
}
