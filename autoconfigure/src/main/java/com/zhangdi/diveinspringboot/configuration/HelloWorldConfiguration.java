package com.zhangdi.diveinspringboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 注入类
 * @author di.zhang
 * @date 2020/8/3
 * @time 20:29
 **/
@Configuration
public class HelloWorldConfiguration {

  @Bean
  public String helloWorld() { // 方法名即 Bean 名称
    return "Hello,World 2018";
  }
}
