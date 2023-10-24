package lab2.decorators;

import jakarta.annotation.Priority;
import jakarta.decorator.Decorator;
import jakarta.decorator.Delegate;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Inject;
import lab2.ITransformationArray;

import java.util.ArrayList;
import java.util.List;


@Decorator
@Priority(1)
public class ChangeElementsProcessor implements ITransformationArray {
    @Inject
    @Delegate
    private ITransformationArray iTransformationArray;


    @Override
    public List<Integer> transform(List<Integer> array) {
        System.out.println("change1");


        array = iTransformationArray.transform(array);

        System.out.println("change2");
        List<Integer> newArray = new ArrayList<>();
        int number = 20;
        int numberToReplace = 1;
        for (Integer i : array) {
            if (numberToReplace == i)
                newArray.add(number);
            else
                newArray.add(i);
        }
        return newArray;
    }
}
