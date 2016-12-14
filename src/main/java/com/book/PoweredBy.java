package com.book;

/**
 * Created by Lavanya Kondragunta on 11/2/2015.
 */

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Component       //Filter or interceptor can be assigned to a resource method using the @NameBinding annotation
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PoweredBy {
    String value() default "";
}
