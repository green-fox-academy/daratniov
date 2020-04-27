package com.greenfoxacademy.dependencyinjection.coloringaround.services;

import com.greenfoxacademy.dependencyinjection.helloidproject.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("blueColor")
public class BlueColor implements MyColor {
  private Printer printer;

  @Autowired
  public BlueColor(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void printColor() {
    printer.log("This is a blue color!");
  }
}
