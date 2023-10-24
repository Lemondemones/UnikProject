package lab2;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;


import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Weld weld = new Weld();
        WeldContainer weldContainer = weld.initialize();
        TransformArray transformArray = weldContainer.instance().select(TransformArray.class).get();
        List<Integer> array = Arrays.asList(2,0,1,3,45,56,1,5,10,23,4,5,5,5,5);
        System.out.println(transformArray.transform(array));
    }
}
