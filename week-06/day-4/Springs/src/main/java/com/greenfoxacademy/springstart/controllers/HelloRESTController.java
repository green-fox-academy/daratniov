package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.Greeting;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  AtomicLong greetCount = new AtomicLong();

  @GetMapping(value = "/greeting")
  public Greeting greeting(@RequestParam(defaultValue = "Stranger", required = false) String name) {
    return new Greeting(greetCount.incrementAndGet(), "Hello, " + name + "!");
  }
}
