package com.zhangdi.diveinspringboot.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;

/**
 * After HelloWorldApplicationContextInitializer
 * <p>
 * 此处使用实现{@link Ordered} 接口的形式，来实现执行顺序
 *
 * @author di.zhang
 * @date 2020/8/4
 * @time 14:52
 **/
public class AfterHelloWorldApplicationContextInitializer<C extends ConfigurableApplicationContext> implements
    ApplicationContextInitializer<C>, Ordered {

  @Override
  public void initialize(C applicationContext) {
    System.out
        .println("After Application.id = " + applicationContext.getId());
  }

  @Override
  public int getOrder() {
    return Ordered.LOWEST_PRECEDENCE;
  }
}
