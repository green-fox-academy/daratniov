package com.greenfoxacademy.backendapi.models;

public class AppendA {

  private String appended;

  public AppendA(String text) {
    this.appended = text+"a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
