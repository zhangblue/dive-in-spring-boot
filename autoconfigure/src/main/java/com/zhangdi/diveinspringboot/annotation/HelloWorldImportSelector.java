package com.zhangdi.diveinspringboot.annotation;

import com.zhangdi.diveinspringboot.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * HelloWorld {@link ImportSelector} 实现
 *
 * @author di.zhang
 * @date 2020/8/3
 * @time 20:15
 **/
public class HelloWorldImportSelector implements ImportSelector {

  @Override
  public String[] selectImports(AnnotationMetadata annotationMetadata) {
    return new String[]{HelloWorldConfiguration.class.getName()};
  }
}
