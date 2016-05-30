package com.devdays.concourse;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;

@EnableAutoConfiguration
public class WebConfig {

  @Bean
  public HelloWorldController helloWorldController() {
    return new HelloWorldController();
  }
}
