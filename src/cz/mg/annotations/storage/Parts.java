package cz.mg.annotations.storage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Marks field that holds a collection of parts.
 * @see Part
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({
    ElementType.FIELD,
    ElementType.LOCAL_VARIABLE,
    ElementType.METHOD,
    ElementType.PARAMETER,
    ElementType.TYPE_USE
})
public @interface Parts {
}
