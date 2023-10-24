package lab1.example;

import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Default;

@Default
public class OnlyCosClass implements FinderInterface {

    public double find(double corner) {
        corner = corner/180 * Math.PI;
        double tg =  Math.sqrt(1/(Math.pow(Math.cos(corner), 2) )-1);
        return tg;
    }
}
