package com.greenfoxacademy.dependencyinjection.coloringaround.services;

import com.greenfoxacademy.dependencyinjection.helloidproject.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class RedColor implements MyColor {
  private Printer printer;

  @Autowired
  public RedColor(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void printColor() {
    printer.log("This is a red color!");
  }
}
