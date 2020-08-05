package com.zhangdi.diveinspringboot.bootstrap;

import com.zhangdi.diveinspringboot.annotation.EnableHelloWord;
import com.zhangdi.diveinspringboot.beans.HelloWordBean;
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
@EnableHelloWord
public class SpringApplicationBootstrap {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = new SpringApplicationBuilder(
        SpringApplicationBootstrap.class)
        .web(WebApplicationType.NONE)
        .run(args);

    HelloWordBean helloWordBean = context.getBean("helloWordBean", HelloWordBean.class);
    helloWordBean.sayHi();

    // 关闭上下文
    context.close();
  }

}
