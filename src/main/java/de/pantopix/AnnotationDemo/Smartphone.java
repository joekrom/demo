package de.pantopix.AnnotationDemo;

import java.lang.annotation.*;

@Inherited
@Documented
@Target(ElementType.TYPE) // for Class
@Retention(RetentionPolicy.RUNTIME)

// Marker annotation @interface
public @interface Smartphone {
    /**
      Depending on the number of methods it can be Single value annotation or multi value annotation
     **/

    String os() default "john doe";
    int version() default 1;
}
