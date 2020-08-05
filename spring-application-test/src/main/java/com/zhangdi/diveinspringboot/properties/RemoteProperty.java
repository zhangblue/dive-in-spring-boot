package com.zhangdi.diveinspringboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author di.zhang
 * @date 2020/8/5
 * @time 18:28
 **/
@ConfigurationProperties(prefix = "test")
public class RemoteProperty {

  private String name;
  private int age;
  private String sex;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }
}
