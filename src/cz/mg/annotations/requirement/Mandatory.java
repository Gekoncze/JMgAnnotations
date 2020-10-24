package cz.mg.annotations.requirement;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


// Applicable only to entity fields.
// Annotated field must not be null.
// If applied to collection, then it is the same as if CollectionMandatory and ItemsMandatory annotations were applied.
@Retention(RetentionPolicy.RUNTIME)
@Target({
    ElementType.FIELD,
    ElementType.LOCAL_VARIABLE,
    ElementType.METHOD,
    ElementType.PARAMETER,
    ElementType.TYPE_USE
})
public @interface Mandatory {
}
