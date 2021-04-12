package com.ymmihw.spring.cloud.sentinel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ymmihw.spring.cloud.sentinel.service.GreetingService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class GreetingController {

  private final GreetingService greetingService;

  @GetMapping("/hello")
  public String getGreeting() {
    return greetingService.getGreeting();
  }

}
