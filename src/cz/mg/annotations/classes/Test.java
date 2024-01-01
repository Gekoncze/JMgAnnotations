package cz.mg.annotations.classes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Marks test class.
 * Test classes are used to test production code.
 * Test classes should never be used in production code.
 * Production code should be compilable and runnable without test classes.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({
    ElementType.TYPE,
    ElementType.FIELD
})
public @interface Test {
}
