package com.devdays.concourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloWorldController {

  @RequestMapping("/")
  public @ResponseBody Map<String, String> helloWorld() {
    Map<String, String> result = new HashMap<>();
    result.put("greeting", "Hello, Dev Days 2016!");
    return result;
  }
}
