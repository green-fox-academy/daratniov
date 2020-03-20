import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import sum.Sum;

public class SumTest {

  Sum sum;
  ArrayList<Integer> testNumbers;

  @Test
  public void sum_MultipleElements_ReturnsSum() {
    sum = new Sum();
    testNumbers = new ArrayList<>(Arrays.asList(0, 2, 3, -4, 2));
    assertEquals(3, sum.sum(testNumbers));
  }

  @Test
  public void sum_EmptyList_ReturnsZero() {
    sum = new Sum();
    testNumbers = new ArrayList<>();
    assertEquals(0, sum.sum(testNumbers));
  }

  @Test
  public void sum_OneElement_ReturnsTheValueOfThatElement() {
    sum = new Sum();
    testNumbers = new ArrayList<>(Arrays.asList(-3));
    assertEquals(-3, sum.sum(testNumbers));
  }

  @Test
  public void sum_Null_ReturnsNull() {
    sum = new Sum();
    assertEquals(0, sum.sum(testNumbers));
  }
}