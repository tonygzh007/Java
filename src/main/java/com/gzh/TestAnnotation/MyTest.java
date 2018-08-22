package com.gzh.TestAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 */
/*注解的生命周期，运行时*/
@Retention(RetentionPolicy.RUNTIME)
/*只能定义在方法上*/
@Target(ElementType.METHOD)
public @interface MyTest {
}
