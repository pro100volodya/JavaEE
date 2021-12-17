package CDI;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.interceptor.AroundConstruct;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;


public class Interceptor {
    @AroundConstruct
    private Object aroundFlight(InvocationContext context) throws Exception {
        System.out.println("Before flight");
        return context.proceed();
    }

    @PostConstruct
    private void postFlight(InvocationContext context) throws Exception {
        System.out.println("Post flight");
        context.proceed();
    }

    @AroundInvoke
    private Object aroundCheckIn(InvocationContext context) throws Exception {
        System.out.println("Before check in");
        return context.proceed();
    }

    @PreDestroy
    private void preDestroy() {
        System.out.println("Destroy live cycle bean");
    }
}
