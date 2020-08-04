package com.zhangdi.diveinspringboot.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * {@link EnableAutoConfiguration} 引导类
 *
 * @author di.zhang
 * @date 2020/8/4
 * @time 12:24
 **/
@EnableAutoConfiguration
public class EnableAutoConfigurationBootstrap {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = new SpringApplicationBuilder(
        EnableAutoConfigurationBootstrap.class)
        .web(WebApplicationType.NONE)
        .run(args);

    // 关闭上下文
    context.close();
  }

}
