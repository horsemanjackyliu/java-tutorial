package com.sap.javatutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

  public static void main(String[] args) {

    SpringApplication.run(HelloWorldApplication.class, args);
    System.out.print("Hello World");
  }

}
