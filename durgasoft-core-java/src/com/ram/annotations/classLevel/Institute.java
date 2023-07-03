package com.ram.annotations.classLevel;

import java.lang.annotation.*;

@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Institute {
        String name() default "DurgaSoft";
        String branch() default "Ameerpet";
        String website() default "www.durgasoft.com";
        String phone() default "7709856023";
}
