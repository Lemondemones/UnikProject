package lab1.example.Interceptors;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.InvocationContext;


public class FinderIntereceptor {

    // Аннотация указывает, что метод будет выполняться вокруг вызываемого метода
    @AroundInvoke
    public Object myInterceptor(InvocationContext invocationContext) throws Exception {
        // Замеряем время начала выполнения метода
        long startTime = System.currentTimeMillis();

        try {
            return invocationContext.proceed();
        } finally {
            // Рассчитываем разницу времени выполнения метода
            long diffTime = System.currentTimeMillis() - startTime;
            System.out.println(invocationContext.getMethod() + " took " + diffTime + " millis ");
        }
    }
}
