package com.zhangdi.diveinspringboot.configuration;

import com.zhangdi.diveinspringboot.beans.HelloWordBean;
import com.zhangdi.diveinspringboot.properties.RemoteProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author di.zhang
 * @date 2020/8/5
 * @time 18:39
 **/
@Configuration
@EnableConfigurationProperties(value = RemoteProperty.class)
public class HelloWorldConfiguration {

  @Bean(name = "helloWordBean")
  public HelloWordBean helloWorld(@Autowired RemoteProperty remoteProperty) { // 方法名即 Bean 名称
    return new HelloWordBean(remoteProperty.getName(), remoteProperty.getAge(),
        remoteProperty.getSex());
  }
}
