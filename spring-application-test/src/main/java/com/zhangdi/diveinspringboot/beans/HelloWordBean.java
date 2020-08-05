package com.zhangdi.diveinspringboot.beans;

/**
 * @author di.zhang
 * @date 2020/8/5
 * @time 18:35
 **/
public class HelloWordBean {

  private String name;
  private int age;
  private String sex;

  public HelloWordBean(String name, int age, String sex) {
    this.name = name;
    this.age = age;
    this.sex = sex;
  }

  public void sayHi() {
    System.out.println("Hello " + name + ", your age is " + age + " you are " + sex);
  }

}
