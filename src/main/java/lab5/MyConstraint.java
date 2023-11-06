package lab5;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.*;

@Retention(RUNTIME)
@Target({FIELD, METHOD, TYPE, PARAMETER, ANNOTATION_TYPE, CONSTRUCTOR})
@Constraint(validatedBy = {MyValidationClass.class})
public @interface MyConstraint {
    String message() default "{lab5.errorMessage}";
    Class <?>[] groups() default {} ;
    Class <? extends Payload>[] payload() default {};

}
