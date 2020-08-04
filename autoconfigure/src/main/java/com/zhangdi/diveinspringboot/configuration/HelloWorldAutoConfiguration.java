package com.zhangdi.diveinspringboot.configuration;

import com.zhangdi.diveinspringboot.annotation.EnableHelloWorld;
import com.zhangdi.diveinspringboot.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

/**
 * HelloWord自动装配
 *
 * @author di.zhang
 * @date 2020/8/4
 * @time 12:26
 **/
@Configuration //Spring模式注解
@EnableHelloWorld // Spring @Enable 模块装配
@ConditionalOnSystemProperty(name = "user.name", value = "zhangblue") //Spring 条件装配
public class HelloWorldAutoConfiguration {

}
