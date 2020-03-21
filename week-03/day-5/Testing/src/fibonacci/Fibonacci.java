package fibonacci;

public class Fibonacci {
  public int fibonacciCounter(int index) {
    int sum = 0;
    int a = 0;
    int b = 1;

    if (index <= 0) return -1;
    else if (index == 1)return a;
    else if (index == 2) return b;
    else {
      for (int i = 0; i < index - 2; i++) {
        sum = a+b;
        a = b;
        b = sum;
      }
      return sum;
    }
  }
}
