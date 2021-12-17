package EJB;

import javax.ejb.Remote;

@Remote
public interface RemoteInformation {
    void printInfo();
}
