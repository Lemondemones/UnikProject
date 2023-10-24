package lab1.example;


import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Default;

@Alternative
public class SinCosClass implements FinderInterface {
    public double find(double corner) {
        corner = corner/180 * Math.PI;
        double tg = Math.sin(corner)/Math.cos(corner);
        return tg;
    }
}
