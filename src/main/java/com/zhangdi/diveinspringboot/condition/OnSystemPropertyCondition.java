package com.zhangdi.diveinspringboot.condition;

import java.util.Map;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 系统属性条件判断
 *
 * @author zhangd
 */
public class OnSystemPropertyCondition implements Condition {

  @Override
  public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
    Map<String, Object> attributes = metadata
        .getAnnotationAttributes(ConditionalOnSystemProperty.class.getName());

    String propertyName = String.valueOf(attributes.get("name"));
    String propertyValue = String.valueOf(attributes.get("value"));

    String envProperty = context.getEnvironment().getProperty(propertyName);
    System.out.println(envProperty);

    return propertyValue.equals(envProperty);
  }
}
