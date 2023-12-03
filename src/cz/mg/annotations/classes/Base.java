package cz.mg.annotations.classes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Marks base service class.
 * To be used together with {@link Service} annotation.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({
    ElementType.TYPE
})
public @interface Base {
}
