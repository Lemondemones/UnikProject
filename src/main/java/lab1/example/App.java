package lab1.example;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class App {
    public static void main( String[] args ) {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize(); // контейнер
        FinderClass finderClass = container.instance().select(FinderClass.class).get();// инициализация класса через контейнер
        double corner = 30;
        System.out.println(finderClass.findCorner(corner));
        weld.shutdown(); //умер
    }
}
