package com.greenfoxacademy.backendapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;

public class Array {
  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  private int[] numbers;
  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  private String what;
  private String result;

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public void setResultByInputParameters() {
    if (what.matches("sum")) {
      result = String.valueOf(Arrays.stream(numbers).sum());
    }
    if (what.matches("multiply")) {
      result = String.valueOf(Arrays.stream(numbers).reduce(1, (x, y) -> x * y));
    }
    if (what.matches("double")) {
      result = Arrays.toString(Arrays.stream(numbers).map(x -> x * 2).toArray());
    }
  }
}
