package com.example.springbatch.springbatchdemo;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableBatchProcessing
@ComponentScan("com.example.springbatch.config")
public class SpringbatchdemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbatchdemoApplication.class, args);
  }
}
