package cz.mg.annotations.misc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Marks fields that holds object(s) only for performance optimization.
 * The object can be cleared and recreated from source data at any time.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({
    ElementType.FIELD,
    ElementType.LOCAL_VARIABLE,
    ElementType.METHOD,
    ElementType.PARAMETER,
    ElementType.TYPE_USE
})
public @interface Cache {
}
