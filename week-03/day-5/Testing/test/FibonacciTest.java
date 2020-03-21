import static org.junit.Assert.*;

import fibonacci.Fibonacci;
import org.junit.Test;

public class FibonacciTest {

  Fibonacci fibonacci;
  int index;

  @Test
  public void fibonacciCounter_NegativeNumber_ReturnsEqual() {
    fibonacci = new Fibonacci();
    index = -5;
    assertEquals(-1, fibonacci.fibonacciCounter(index));
  }

  @Test
  public void fibonacciCounter_Zero_ReturnsEqual() {
    fibonacci = new Fibonacci();
    index = 0;
    assertEquals(-1, fibonacci.fibonacciCounter(index));
  }

  @Test
  public void fibonacciCounter_FirstElement_ReturnsEqual() {
    fibonacci = new Fibonacci();
    index = 1;
    assertEquals(0, fibonacci.fibonacciCounter(index));
  }

  @Test
  public void fibonacciCounter_SecondElement_ReturnsEqual() {
    fibonacci = new Fibonacci();
    index = 2;
    assertEquals(1, fibonacci.fibonacciCounter(index));
  }

  @Test
  public void fibonacciCounter_ThirdElement_ReturnsEqual() {
    fibonacci = new Fibonacci();
    index = 3;
    assertEquals(1, fibonacci.fibonacciCounter(index));
  }

  @Test
  public void fibonacciCounter_TenthElement_ReturnsEqual() {
    fibonacci = new Fibonacci();
    index = 10;
    assertEquals(34, fibonacci.fibonacciCounter(index));
  }
}