package com.zhangdi.diveinspringboot.beans;

/**
 * @author di.zhang
 * @date 2020/8/5
 * @time 18:37
 **/
public class AfterHelloWordBean {

  private HelloWordBean helloWordBean;

  public AfterHelloWordBean(HelloWordBean helloWordBean) {
    this.helloWordBean = helloWordBean;
  }

  public void sayHi() {
    System.out.println("AfterHelloWordBean......");
  }
}
