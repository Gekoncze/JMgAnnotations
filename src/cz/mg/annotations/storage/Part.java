package cz.mg.annotations.storage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Marks field that holds an object, which is part of current object.
 * Current object is owner of the part.
 * Part can be owned only by a single object.
 * Part can be moved to another object (owner can change).
 * Cyclic ownership is not allowed (only tree hierarchy allowed).
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
