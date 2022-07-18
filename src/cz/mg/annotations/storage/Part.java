package cz.mg.annotations.storage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Marks field that owns another object.
 * The owned object should be owned only by a single object.
 * The owned object can be moved to another owner.
 * There must be no cyclic ownership, ie only tree ownership hierarchy is allowed.
 * When owner is destroyed, then owned object should be either moved to another owner or be destroyed too.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({
    ElementType.FIELD,
    ElementType.LOCAL_VARIABLE,
    ElementType.METHOD,
    ElementType.PARAMETER,
    ElementType.TYPE_USE
})
public @interface Part {
}
