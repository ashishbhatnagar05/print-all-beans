package com.microservices.practise.printallbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class PrintBeansUtility {
  @Autowired ApplicationContext context;

  public void print() {
    String[] beans = context.getBeanDefinitionNames();
    Stream.of(beans).forEach((bean) -> System.out.println(bean));
  }
}
