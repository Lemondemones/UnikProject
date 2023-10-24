package lab2;


import jakarta.inject.Inject;

import java.util.List;


public class TransformArray {
    @Inject
    ITransformationArray iTransformationArray;

    public List<Integer> transform(List<Integer> array) {
        return iTransformationArray.transform(array);
    }

}
