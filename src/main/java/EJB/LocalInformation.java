package EJB;

import javax.ejb.Local;

@Local
public interface LocalInformation {
    void printInfo();
}
