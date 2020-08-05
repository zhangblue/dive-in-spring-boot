package com.zhangdi.diveinspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author di.zhang
 * @date 2020/8/4
 * @time 14:58
 **/
@SpringBootApplication
public class SpringApplicationBootstrap {

  public static void main(String[] args) {
    SpringApplication springApplication = new SpringApplication(SpringApplicationBootstrap.class);
    springApplication.run(args);
  }

}
