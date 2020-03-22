import static org.junit.Assert.*;

import org.junit.Test;
import sharpie.Sharpie;

public class SharpieTest {
  Sharpie sharpie;

  @Test
  public void sharpieConstructor_InkAmount_ReturnsEqual() {
    sharpie = new Sharpie("green", 10.37);
    assertEquals(100, sharpie.inkAmount);
  }

  @Test
  public void sharpieConstructor_Width_ReturnsEqual() {
    sharpie = new Sharpie("green", 10.37);
    assertEquals(10.37, sharpie.width, 0);
  }

  @Test
  public void sharpieConstructor_Color_ReturnsEqual() {
    sharpie = new Sharpie("green", 10.37);
    assertEquals("green", sharpie.color);
  }

  @Test
  public void sharpieConstructor_EmptyColor_ReturnsEqual() {
    sharpie = new Sharpie("", 10.37);
    assertEquals(null, sharpie.color);
  }

  @Test
  public void use_UseOneTime_ReturnsEqual() {
    sharpie = new Sharpie("blue", -9.21);
    sharpie.use();
    assertEquals(99, sharpie.inkAmount);
  }

  @Test
  public void use_UseWhenEmpty_ReturnsEqual() {
    sharpie = new Sharpie("blue", -9.21);
    sharpie.inkAmount = 0;
    sharpie.use();
    assertEquals(0, sharpie.inkAmount);
  }
}