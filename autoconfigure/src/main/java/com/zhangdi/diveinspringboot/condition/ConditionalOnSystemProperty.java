package com.zhangdi.diveinspringboot.condition;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.context.annotation.Conditional;

/**
 * java 系统属性条件判断
 *
 * @author zhangd
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
@Conditional(OnSystemPropertyCondition.class) //自定义注解实现
public @interface ConditionalOnSystemProperty {

  /**
   * java系统属性名称
   *
   * @return
   */
  String name();

  /**
   * java系统属性值
   *
   * @return
   */
  String value();

}
