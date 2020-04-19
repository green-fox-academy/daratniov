package com.greenfoxacademy.springstart.classes;

public class FizzBuzzWoof {
  private String keyWord;
  private long fontSize;

  public FizzBuzzWoof(long number) {
    this.keyWord = generateKeyWord(number);
    this.fontSize = generateFontSize(number);
  }

  private long generateFontSize(long number) {
    if (this.keyWord.matches("[a-zA-Z]+")) {
      return (this.keyWord.length() / 4) * 24;
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

  public String getKeyWord() {
    return keyWord;
  }

  public long getFontSize() {
    return fontSize;
  }
}