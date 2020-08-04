package com.zhangdi.diveinspringboot.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;

/**
 * After HelloWordApplicationListener 监听器， 监听{@link ContextRefreshedEvent} 事件
 *
 * @author di.zhang
 * @date 2020/8/4
 * @time 21:09
 **/
public class AfterHelloWordApplicationListener implements
    ApplicationListener<ContextRefreshedEvent>, Ordered {

  @Override
  public void onApplicationEvent(ContextRefreshedEvent event) {
    System.out.println("After HelloWordApplicationListener id = " +
        event.getApplicationContext().getId() + " , timestemp = " + event.getTimestamp());
  }

  @Override
  public int getOrder() {
    return Ordered.LOWEST_PRECEDENCE;
  }
}
