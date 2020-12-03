package cz.mg.annotations.storage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


// Applicable only to entity fields.
// Annotated field just holds reference to another object (no ownership).
@Retention(RetentionPolicy.RUNTIME)
@Target({
    ElementType.FIELD,
    ElementType.TYPE_USE,
    ElementType.PARAMETER,
    ElementType.METHOD
})
public @interface Link {
}
