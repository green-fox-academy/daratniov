import static org.junit.Assert.*;

import apples.Apple;
import org.junit.Test;

public class AppleTest {

  Apple apple = new Apple();

  @Test
  public void getApple_Apple_ReturnsEquals() {
    assertEquals("apple", apple.getApple());
  }

  @Test
  public void getApple_Ale_ReturnsNotEquals() {
    assertNotEquals("ale", apple.getApple());
  }

  @Test
  public void getApple_Nothing_ReturnsNotEquals() {
    assertNotEquals("", apple.getApple());
  }
}