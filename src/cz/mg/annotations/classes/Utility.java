package cz.mg.annotations.classes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Marks utility class.
 * Universal type of class that does not fit into any other category.
 * It may contain business logic as well as stateful fields.
 * Can be both static or non-static.
 * Should not be confused with traditional meaning of a static class.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Utility {
}
