package lab2.decorators;

import jakarta.annotation.Priority;
import jakarta.decorator.Decorator;
import jakarta.decorator.Delegate;
import jakarta.inject.Inject;
import lab2.ITransformationArray;

import java.util.*;

@Decorator
@Priority(2)
public class MedianFilterProcessor implements ITransformationArray {
    @Delegate
    @Inject
    ITransformationArray iTransformationArray;
    @Override
    public List<Integer> transform(List<Integer> array) {
        System.out.println("median1");
        array = iTransformationArray.transform(array);
        List<Integer> newArray = new ArrayList<>();
        System.out.println("median2");
        for (int i = 1; i < array.size() ; i++)
           if ((array.size()-i)==2)
              newArray.add(median(array.get(array.size()-3), array.get(array.size()-2), array.get(array.size()-1)));
            else if ((array.size()-i)==1)
               newArray.add(median(array.get(array.size()-2), array.get(array.size()-1), array.get(array.size()-1)));
           else
               newArray.add(median(array.get(i-1), array.get(i), array.get(i+1)));
        newArray.add(array.get(array.size()-1));
        return newArray;

    }

    private int median(int a, int b, int c) {
        List<Integer> myArray = Arrays.asList(a,b,c);
        Collections.sort(myArray);
        return myArray.get(1);
    }
}
