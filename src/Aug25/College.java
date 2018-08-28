package Aug25;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.FIELD,ElementType.TYPE})//specify the target for the annocation
@Retention(RetentionPolicy.RUNTIME)//availability
public @interface College {
    String name();
    String location();

}
