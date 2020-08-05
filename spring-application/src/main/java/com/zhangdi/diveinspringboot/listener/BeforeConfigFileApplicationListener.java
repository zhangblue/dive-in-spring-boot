package com.zhangdi.diveinspringboot.listener;

import org.springframework.boot.context.config.ConfigFileApplicationListener;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.core.Ordered;

/**
 * Before {@link ConfigFileApplicationListener}
 *
 * @author di.zhang
 * @date 2020/8/5
 * @time 12:50
 **/
public class BeforeConfigFileApplicationListener implements SmartApplicationListener, Ordered {

  /**
   * 设置所要监听的事件类型
   *
   * @param eventType
   * @return
   */
  @Override
  public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
    return ApplicationEnvironmentPreparedEvent.class.isAssignableFrom(eventType)
        || ApplicationPreparedEvent.class.isAssignableFrom(eventType);
  }

  /**
   * 设置当触发事件后， 执行什么逻辑
   *
   * @param event
   */
  @Override
  public void onApplicationEvent(ApplicationEvent event) {
    if (event instanceof ApplicationEnvironmentPreparedEvent) {
      ApplicationEnvironmentPreparedEvent applicationEnvironmentPreparedEvent = (ApplicationEnvironmentPreparedEvent) event;

      String name = applicationEnvironmentPreparedEvent.getEnvironment().getProperty("name");
      System.out.println("properties name = " + name);
    }
  }

  /**
   * 设置执行顺序,因为是要在{@link ConfigFileApplicationListener}之前执行，所以返回值应当比{@link
   * ConfigFileApplicationListener}的优先级高1级即可
   *
   * @return
   */
  @Override
  public int getOrder() {
    return ConfigFileApplicationListener.DEFAULT_ORDER - 1;
  }
}
