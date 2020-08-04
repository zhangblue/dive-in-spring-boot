package com.zhangdi.diveinspringboot.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.context.annotation.Import;

/**
 * 自定义注解， 使用@Import 标记注解实现类 {@link HelloWorldImportSelector}
 *
 * @author di.zhang
 * @date 2020/8/3
 * @time 20:27
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(HelloWorldImportSelector.class)
public @interface EnableHelloWorld {

}
