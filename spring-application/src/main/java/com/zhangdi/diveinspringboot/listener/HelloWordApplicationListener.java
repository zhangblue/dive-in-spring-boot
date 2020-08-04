package com.zhangdi.diveinspringboot.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * HelloWord 监听器 {@link ApplicationListener}，监听 {@link ContextRefreshedEvent} 事件
 *
 * @author di.zhang
 * @date 2020/8/4
 * @time 21:05
 **/
@Order(Ordered.HIGHEST_PRECEDENCE) //设置最高优先级
public class HelloWordApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

  @Override
  public void onApplicationEvent(ContextRefreshedEvent event) {
    System.out.println("HelloWordApplicationListener id = " +
        event.getApplicationContext().getId() + " , timestemp = " + event.getTimestamp());
  }
}
