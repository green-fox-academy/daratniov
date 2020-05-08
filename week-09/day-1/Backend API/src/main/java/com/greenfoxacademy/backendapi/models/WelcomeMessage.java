package com.greenfoxacademy.backendapi.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class WelcomeMessage {

  private String welcome_message;
  @JsonIgnore
  private String name;
  @JsonIgnore
  private String title;

  public WelcomeMessage(String name, String title) {
    this.name=name;
    this.title=title;
    this.welcome_message = "Oh, hi there " + this.name + ", my dear " + this.title + "!";
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
