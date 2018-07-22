package com.example.webmvc.annotation;

import java.lang.annotation.*;

/**
 * Created by James on 2018/7/22.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyService {
    String value() default "";
}
