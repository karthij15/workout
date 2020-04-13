package com.kj.main;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.component.slack.SlackComponent;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.camel.builder.RouteBuilder;

@SpringBootApplication
public class CamelBoot {

  public static void main(String[] args) {
    System.out.println("Inited!");

    org.springframework.boot.SpringApplication.run(CamelBoot.class, args);

    //To keep the main thread blocked so that Camel stays up,add camel.springboot.main-run-controller=true to the application.properties

  System.out.println("Completed!");
  }
}
