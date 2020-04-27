package com.greenfoxacademy.dependencyinjection;

import com.greenfoxacademy.dependencyinjection.coloringaround.services.MyColor;
import com.greenfoxacademy.dependencyinjection.helloidproject.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjectionApplication implements CommandLineRunner {
  private Printer printer;
  private MyColor color;

  @Autowired
  public DependencyInjectionApplication(Printer printer, @Qualifier("greenColor") MyColor color) {
    this.printer = printer;
    this.color = color;
  }

  public static void main(String[] args) {
    SpringApplication.run(DependencyInjectionApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
    color.printColor();
  }
}
