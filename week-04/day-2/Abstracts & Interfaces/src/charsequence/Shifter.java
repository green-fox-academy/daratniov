package charsequence;

import java.util.stream.IntStream;

public class Shifter implements CharSequence {
  private String string;
  private int numberToShift;

  public Shifter(String string, int numberToShift) {
    this.string = string;
    this.numberToShift = numberToShift;
  }

  @Override
  public int length() {
    return this.string.length();
  }

  @Override
  public char charAt(int i) {
    return this.string.charAt(i + numberToShift);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return this.string.subSequence(start + numberToShift, end + numberToShift);
  }

  @Override
  public IntStream chars() {
    return this.string.chars();
  }

  @Override
  public IntStream codePoints() {
    return this.string.codePoints();
  }
}
