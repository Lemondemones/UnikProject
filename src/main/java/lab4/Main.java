package lab4;

import javax.validation.*;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        try {
            PathPassage pathPassage = new PathPassage();
            pathPassage.setId(12);
            pathPassage.setName("B108/3");
            pathPassage.setLength(0);
            pathPassage.setConstructionDate("10-11-2220");
            pathPassage.setCountWay(2);
            pathPassage.setStationName1("dwqeq");
            pathPassage.setStationName2("wqeewq");

            Set<ConstraintViolation<PathPassage>> violation1 = validator.validate(pathPassage);
            if (!violation1.isEmpty()){
                for (ConstraintViolation<PathPassage> violation: violation1){
                    System.out.println(violation.getPropertyPath()+" "+ violation.getMessage());
                }
            } else {
                System.out.println("PathPassage валиден");
            }

            PurePathPassage purePathPassage = new PurePathPassage();
            purePathPassage.setId(12);
            purePathPassage.setName("B108/3");
            purePathPassage.setLength(100);
            purePathPassage.setConstructionDate("10-11-2220");
            purePathPassage.setCountWay(0);
            purePathPassage.setStationName1("dwqeq");
            purePathPassage.setStationName2("wqeewq");

            Set<ConstraintViolation<PurePathPassage>> violation2 = validator.validate(purePathPassage);
            if (!violation2.isEmpty()){
                for (ConstraintViolation<PurePathPassage> violation: violation2){
                    System.out.println(violation.getPropertyPath()+" "+ violation.getMessage());
                }
            } else {
                System.out.println("PurePathPassage валиден");
            }

        } finally {
            validatorFactory.close();
        }
    }
}
