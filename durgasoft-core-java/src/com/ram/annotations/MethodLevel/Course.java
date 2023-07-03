package com.ram.annotations.MethodLevel;

import java.lang.annotation.*;

@Inherited
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Course {
    String cid();
    String cname();
    int cfee();
}

