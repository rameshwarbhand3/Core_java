package com.ram.annotations.fieldLevel;

import java.lang.annotation.*;

@Inherited
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @ interface Bank {
    String name() default "Icici Bank";
    String branch() default "Ameerpet";
    String website() default "www.icici.com";
    String phone() default "7709856023";
}
