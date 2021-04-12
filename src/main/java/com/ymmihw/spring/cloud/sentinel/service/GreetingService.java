package com.ymmihw.spring.cloud.sentinel.service;

import org.springframework.stereotype.Service;
import com.alibaba.csp.sentinel.annotation.SentinelResource;

@Service
public class GreetingService {

  @SentinelResource(value = "greeting", fallback = "getGreetingFallback")
  public String getGreeting() {
    return "Hello World!";
  }

  public String getGreetingFallback(Throwable e) {
    e.printStackTrace();
    return "Bye world!";
  }

}
