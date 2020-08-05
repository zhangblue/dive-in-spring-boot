package com.zhangdi.diveinspringboot.listener;

import com.alibaba.fastjson.JSONObject;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.config.ConfigFileApplicationListener;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;

/**
 * @author di.zhang
 * @date 2020/8/5
 * @time 17:38
 **/
public class ReadConfigApplicationListener implements EnvironmentPostProcessor,
    SmartApplicationListener, Ordered {

  @Override
  public void postProcessEnvironment(ConfigurableEnvironment environment,
      SpringApplication application) {

  }

  @Override
  public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
    return ApplicationEnvironmentPreparedEvent.class.isAssignableFrom(eventType)
        || ApplicationPreparedEvent.class.isAssignableFrom(eventType);
  }

  @Override
  public int getOrder() {
    return ConfigFileApplicationListener.DEFAULT_ORDER + 1;
  }

  @Override
  public void onApplicationEvent(ApplicationEvent event) {
    if (event instanceof ApplicationEnvironmentPreparedEvent) {
      onApplicationEnvironmentPreparedEvent((ApplicationEnvironmentPreparedEvent) event);
    }
  }

  private void onApplicationEnvironmentPreparedEvent(ApplicationEnvironmentPreparedEvent event) {
    ConfigurableEnvironment environment = event.getEnvironment();

    String[] activeProfiles = environment.getActiveProfiles();

    //如果是zk的话，就从zk中获取参数
    if (Arrays.asList(activeProfiles).contains("remote")) {
      Map<String, Object> source = environment.getSystemProperties();
      Map<String, Object> systemEnvironment = environment.getSystemEnvironment();
      System.out.println("getSystemProperties() = " + JSONObject.toJSONString(source));
      System.out.println("getSystemEnvironment() = " + JSONObject.toJSONString(systemEnvironment));

      MutablePropertySources propertySources = environment.getPropertySources();

      Properties p = new Properties();
      p.put("test.sex", "boy");
      propertySources.addFirst(new PropertiesPropertySource("remoteProperties", p));
    }
  }
}
