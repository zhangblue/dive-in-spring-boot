package com.zhangdi.diveinspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author di.zhang
 * @date 2020/8/4
 * @time 14:58
 **/
@SpringBootApplication
public class SpringApplicationBootstrap {

  public static void main(String[] args) {
//    ConfigurableApplicationContext context = new SpringApplicationBuilder(
//        SpringApplicationBootstrap.class)
//        .web(WebApplicationType.NONE)
//        .run(args);
//
//    // 关闭上下文
//    context.close();
    SpringApplication springApplication = new SpringApplication(SpringApplicationBootstrap.class);
    springApplication.run(args);
  }

}
