package cz.mg.annotations.storage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Marks field that owns another object.
 * The owned object should be owned only by a single object (owner/parent).
 * The owned object can be moved to another owner.
 * There may be no cyclic ownership, so only tree ownership hierarchy is allowed.
 * Owned object is destroyed when its parent object is destroyed.
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
