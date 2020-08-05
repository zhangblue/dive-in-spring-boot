package com.zhangdi.diveinspringboot.run;

import com.alibaba.fastjson.JSONObject;
import java.util.Properties;
import javax.swing.Spring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author di.zhang
 * @date 2020/8/5
 * @time 11:40
 **/
public class HelloWordRunListener implements SpringApplicationRunListener {

  /**
   * 此处必须有一个构造器
   *
   * @param application
   * @param args
   */
  public HelloWordRunListener(SpringApplication application, String[] args) {
  }

  @Override
  public void starting() {
    System.out.println("HelloWordRunListener starting.....");
  }

  @Override
  public void environmentPrepared(ConfigurableEnvironment environment) {
    System.out
        .println("HelloWordRunListener environmentPrepared： ConfigurableEnvironment 准备妥当，允许进行调整");
  }

  @Override
  public void contextPrepared(ConfigurableApplicationContext context) {
    System.out.println(
        "HelloWordRunListener contextPrepared：ConfigurableApplicationContext 准备妥当， 允许进行调整");
  }

  @Override
  public void contextLoaded(ConfigurableApplicationContext context) {
    System.out
        .println("HelloWordRunListener contextLoaded：ConfigurableApplicatoinContext 状态完成， 但仍然还未启动");
  }

  @Override
  public void started(ConfigurableApplicationContext context) {
    System.out
        .println("HelloWordRunListener started：ConfigurableApplicatoinContext 已启动， 此时Bean已经初始化完成");
  }

  @Override
  public void running(ConfigurableApplicationContext context) {
    System.out.println("HelloWordRunListener running：Spring 应用正在运行");
  }

  @Override
  public void failed(ConfigurableApplicationContext context, Throwable exception) {
    System.out.println("HelloWordRunListener failed：Spring 应用运行失败");
  }
}
