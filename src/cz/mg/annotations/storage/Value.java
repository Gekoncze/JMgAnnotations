package cz.mg.annotations.storage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Marks field that holds a value object.
 * The object should not be shared (unless it is a constant).
 * The object should not be linked by another object.
 * The object is exclusively owned by current object.
 * The object's owner cannot be changed.
 * The object can be structured.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({
    ElementType.FIELD,
    ElementType.LOCAL_VARIABLE,
    ElementType.METHOD,
    ElementType.PARAMETER,
    ElementType.TYPE_USE
})
public @interface Value {
}
