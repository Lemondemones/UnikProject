package lab5;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        try {
            Block block1 = new Block("block1",10);
            Block block2 = new Block("block2",10);
            Block block3 = new Block("block3",10);
            List<Block> blocks = new ArrayList<>();
            blocks.add(block1);
            blocks.add(block2);
            blocks.add(block3);

            PathPassage pathPassage = new PathPassage();
            pathPassage.setId(12);
            pathPassage.setName("B108/3");
            pathPassage.setLength(30);
            pathPassage.setConstructionDate("10-11-2220");
            pathPassage.setCountWay(2);
            pathPassage.setStationName1("dwqeq");
            pathPassage.setStationName2("wqeewq");

            pathPassage.setBlocks(blocks);
            Set<ConstraintViolation<PathPassage>> violation1 = validator.validate(pathPassage);
            if (!violation1.isEmpty()) {
                for (ConstraintViolation<PathPassage> violation : violation1) {
                    System.out.println(violation.getPropertyPath() + " " + violation.getMessage());
                }
            } else {
                System.out.println("PathPassage валиден");
            }

        } finally {
            validatorFactory.close();
        }
    }
}
