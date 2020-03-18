package counter;

public class Counter {
  int counter;
  int defaultValue;

  public Counter() {
  }

  public Counter(int number) {
    counter = number;
    defaultValue = number;
  }

  public void add() {
    counter++;
  }

  public void add(int number) {
    counter += number;
  }

  public int get() {
    return counter;
  }

  public void reset() {
    counter = defaultValue;
  }
}