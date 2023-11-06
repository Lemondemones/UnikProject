package lab5;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyValidationClass implements ConstraintValidator<MyConstraint, PathPassage > {
    @Override
    public void initialize(MyConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }
    @Override
    public boolean isValid(PathPassage pathPassage, ConstraintValidatorContext constraintValidatorContext) {
        int blockLength = 0;
        for (Block block : pathPassage.getBlocks()){
            blockLength += block.getBlockLength();
        }
        if(blockLength == pathPassage.getLength()) {
            return true;
        } else {
            return false;
        }
    }
}
