package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.classes.FizzBuzzWoof;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FizzBuzzWoofController {

  AtomicLong counter = new AtomicLong();

  @RequestMapping("fizz/buzz/woof")
  public String fizzBuzzWoof(Model model) {
    model.addAttribute("fizzBuzzWoof", new FizzBuzzWoof(counter.incrementAndGet()));
    return "fizzbuzzwoof";
  }
}
