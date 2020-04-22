package com.greenfoxacademy.springstart.models;

public class FizzBuzzWoof {
  private String keyWord;
  private long fontSize;

  public FizzBuzzWoof(String keyWord, long fontSize) {
    this.keyWord = keyWord;
    this.fontSize = fontSize;
  }

  public String getKeyWord() {
    return keyWord;
  }

  public long getFontSize() {
    return fontSize;
  }
}