package com.zhangdi.diveinspringboot.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * 此处使用 {@link Order}注解的形式，来实现执行顺序
 *
 * @author di.zhang
 * @date 2020/8/4
 * @time 14:50
 **/
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloWorldApplicationContextInitializer<C extends ConfigurableApplicationContext> implements
    ApplicationContextInitializer<C> {

  @Override
  public void initialize(C applicationContext) {
    System.out.println("applicationContext.id = " + applicationContext.getId());
  }
}
