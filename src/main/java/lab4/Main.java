package lab4;

import javax.validation.*;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        try {
            PathPassage pathPassage = new PathPassage();
            pathPassage.setId(0);
            pathPassage.setName("");
            pathPassage.setLength(20);
            pathPassage.setConstructionDate("10-11-2220222");
            pathPassage.setCountWay(21);
            pathPassage.setStationName1("dwйц");
            pathPassage.setStationName2("wqуц");

            Set<ConstraintViolation<PathPassage>> violation1 = validator.validate(pathPassage);
            if (!violation1.isEmpty()){
                for (ConstraintViolation<PathPassage> violation: violation1){
                    System.out.println(violation.getPropertyPath()+" "+ violation.getMessage());
                }
            } else {
                System.out.println("PathPassage валиден");
            }

            PurePathPassage purePathPassage = new PurePathPassage();
            purePathPassage.setId(-1);
            purePathPassage.setName("");
            purePathPassage.setLength(20);
            purePathPassage.setConstructionDate("1000-11-2220");
            purePathPassage.setCountWay(0);
            purePathPassage.setStationName1("dwew");
            purePathPassage.setStationName2("wewew");

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
