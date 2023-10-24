package lab1.example;


import jakarta.inject.Inject;
import jakarta.interceptor.Interceptors;
import lab1.example.Interceptors.FinderIntereceptor;

@Interceptors(FinderIntereceptor.class)
public class FinderClass {
    @Inject
    private FinderInterface finderInterface; // внедрение реализации интерфейса

    public double findCorner (double corner){
      return finderInterface.find(corner);
    }
}
