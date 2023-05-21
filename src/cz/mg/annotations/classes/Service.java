package cz.mg.annotations.classes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Marks service class or field.
 * Service class can only hold references to services, otherwise it should be stateless.
 * Service field can only hold reference to a service.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({
    ElementType.TYPE,
    ElementType.FIELD
})
public @interface Service {
}
