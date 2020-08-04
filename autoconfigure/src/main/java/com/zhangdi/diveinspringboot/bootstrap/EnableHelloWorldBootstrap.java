package com.zhangdi.diveinspringboot.bootstrap;

import com.zhangdi.diveinspringboot.annotation.EnableHelloWorld;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 程序启动类
 * <p>
 * 只需使用@EnableHelloWorld注解，则可以将bean进行注入
 *
 * @author di.zhang
 * @date 2020/8/3
 * @time 20:40
 **/
@EnableHelloWorld
public class EnableHelloWorldBootstrap {

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
