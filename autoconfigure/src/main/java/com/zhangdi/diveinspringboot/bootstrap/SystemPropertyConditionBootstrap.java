package com.zhangdi.diveinspringboot.bootstrap;

import com.zhangdi.diveinspringboot.condition.ConditionalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * 系统属性条件引导类
 *
 * @author zhangd
 */

public class SystemPropertyConditionBootstrap {


  @Bean
  @ConditionalOnSystemProperty(name = "user.name", value = "zhangdi")
  public String helloWord() {
    return "hello zhangdi";
  }


  public static void main(String[] args) {
    ConfigurableApplicationContext context = new SpringApplicationBuilder(
        EnableHelloWorldBootstrap.class)
        .web(WebApplicationType.NONE)
        .run(args);

    // helloWorld Bean 是否存在
    String helloWorld =
        context.getBean("helloWorld", String.class);

    System.out.println("helloWorld Bean : " + helloWorld);

    // 关闭上下文
    context.close();
  }
}
