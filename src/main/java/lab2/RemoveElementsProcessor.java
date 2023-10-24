package lab2;

import jakarta.enterprise.inject.Default;

import java.util.*;

@Default
public class RemoveElementsProcessor implements ITransformationArray {
    @Override
    public List<Integer> transform(List<Integer> array) {
        System.out.println("remove");
        int count = 0;
        List<Integer> newArray = new ArrayList<>();
        int number = 5;
        for (Integer i: array) {
            if (number == i) {
                count++;
                if (count <= 1) {
                    newArray.add(i);
                }
            }else {
                newArray.add(i);
            }
        }
        return newArray;
    }
}
