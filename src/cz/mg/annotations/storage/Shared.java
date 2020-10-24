package cz.mg.annotations.storage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


// Applicable only to entity fields.
// Annotated field owns another object.
// Owned object can have multiple owners.
@Retention(RetentionPolicy.RUNTIME)
@Target({
    ElementType.FIELD,
    ElementType.TYPE_USE,
    ElementType.PARAMETER
})
public @interface Shared {
}
