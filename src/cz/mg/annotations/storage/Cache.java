package cz.mg.annotations.storage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


// Applicable only to entity fields.
// Same as Part.
// Indicates that the field holds data required only for optimization.
@Retention(RetentionPolicy.RUNTIME)
@Target({
    ElementType.FIELD,
    ElementType.TYPE_USE,
    ElementType.PARAMETER,
    ElementType.METHOD
})
public @interface Cache {
}
