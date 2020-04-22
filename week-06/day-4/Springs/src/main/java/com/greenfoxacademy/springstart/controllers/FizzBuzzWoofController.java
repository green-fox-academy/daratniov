package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.FizzBuzzWoof;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FizzBuzzWoofController {

  AtomicLong counter = new AtomicLong();

  @GetMapping("fizz/buzz/woof")
  public String fizzBuzzWoof(Model model) {
    String keyWord = generateKeyWord(counter.incrementAndGet());
    long fontSize = generateFontSize(keyWord);
    model.addAttribute("fizzBuzzWoof", new FizzBuzzWoof(keyWord, fontSize));
    return "fizzbuzzwoof";
  }

  private long generateFontSize(String keyWord) {
    if (keyWord.matches("[a-zA-Z]+")) {
      return (keyWord.length() / 4) * 24;
    } else {
      return 16;
    }
  }

  private String generateKeyWord(long number) {
    String keyWord = "";
    if (number % 3 == 0) {
      keyWord += "Fizz";
    }
    if (number % 5 == 0) {
      keyWord += "Buzz";
    }
    if (number % 7 == 0) {
      keyWord += "Woof";
    }
    if (keyWord.isEmpty()) {
      keyWord += number;
    }
    return keyWord;
  }
}
