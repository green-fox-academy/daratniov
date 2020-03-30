package charsequence;

import java.util.stream.IntStream;

public class Gnirts implements CharSequence {
  private String string;

  public Gnirts(String string) {
    this.string = string;
  }

  @Override
  public int length() {
    return this.string.length();
  }

  @Override
  public char charAt(int i) {
    return this.string.charAt(this.string.length() - i - 1);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    CharSequence subSequence = "";
    for (int i = start; i < end; i++) {
      subSequence = subSequence + (charAt(i) + "");
    }
    return subSequence;
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
