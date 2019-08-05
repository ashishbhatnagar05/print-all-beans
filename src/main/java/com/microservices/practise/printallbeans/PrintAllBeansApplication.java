package com.microservices.practise.printallbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Print all the bean definition present in the application context */
@SpringBootApplication
public class PrintAllBeansApplication implements CommandLineRunner {

  @Autowired private PrintBeansUtility printBeansUtility;

  public static void main(String[] args) {
    SpringApplication.run(PrintAllBeansApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printBeansUtility.print();
  }
}
