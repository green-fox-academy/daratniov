package com.greenfoxacademy.springstart.controllers;

import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloInDifferentLanguages {

  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  @GetMapping("hello/in/different/languages")
  public String hello(Model model,
                      @RequestParam(defaultValue = "Stranger", required = false) String name,
                      @RequestParam(defaultValue = "0,0,250", required = false) String color,
                      @RequestParam(defaultValue = "20", required = false) int fontSize) {
    model.addAttribute("hello", hellos[new Random().nextInt(hellos.length)]);
    model.addAttribute("name", name);
    model.addAttribute("color", color);
    model.addAttribute("fontSize", fontSize);
    return "hello";
  }
}