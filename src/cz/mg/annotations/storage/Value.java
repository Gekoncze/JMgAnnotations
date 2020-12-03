package cz.mg.annotations.storage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


// Applicable only to entity fields.
// Annotated field owns another object as its part.
// Owned object must not have multiple owners.
// The object cannot change owner.
@Retention(RetentionPolicy.RUNTIME)
@Target({
    ElementType.FIELD,
    ElementType.TYPE_USE,
    ElementType.PARAMETER,
    ElementType.METHOD
})
public @interface Value {
}
