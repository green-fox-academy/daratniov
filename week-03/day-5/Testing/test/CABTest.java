import static org.junit.Assert.*;

import cowsandbulls.CAB;
import org.junit.Test;

public class CABTest {

  CAB cab;

  @Test
  public void CABConstructor_State_ReturnsEqual() {
    cab = new CAB();
    assertEquals(CAB.State.PLAYING, cab.state);
  }

  @Test
  public void CABConstructor_Counter_ReturnsEqual() {
    cab = new CAB();
    assertEquals(0, cab.counter);
  }

  @Test
  public void CABConstructor_NumberToGuess_ReturnsTrue() {
    cab = new CAB();
    assertTrue(cab.numberToGuess >= 1000 && cab.numberToGuess < 10000);
  }

  @Test
  public void guess_NumberWithMoreThanFourDigits_ReturnsEqual() {
    cab = new CAB();
    assertEquals("Give me a four digit number!", cab.guess(234564));
  }

  @Test
  public void guess_NumberWithLessThanFourDigits_ReturnsEqual() {
    cab = new CAB();
    assertEquals("Give me a four digit number!", cab.guess(4));
  }

  @Test
  public void guess_GuessTheCorrectNumber_ReturnsEqual() {
    cab = new CAB();
    cab.numberToGuess = 1234;
    assertEquals("You have found the number with 1 guesses!", cab.guess(1234));
  }

  @Test
  public void guess_AlreadyFoundTheNumber_ReturnsEqual() {
    cab = new CAB();
    cab.numberToGuess = 1234;
    cab.guess(1234);
    assertEquals("You have already found the number!", cab.guess(432345));
  }

  @Test
  public void guess_0Cow0Bull_ReturnsEqual() {
    cab = new CAB();
    cab.numberToGuess = 1234;
    assertEquals("0 cow, 0 bull", cab.guess(5678));
  }

  @Test
  public void guess_0Cow1Bull_ReturnsEqual() {
    cab = new CAB();
    cab.numberToGuess = 1234;
    assertEquals("0 cow, 1 bull", cab.guess(2678));
  }

  @Test
  public void guess_0Cow1BullButTwoOfTheSame_ReturnsEqual() {
    cab = new CAB();
    cab.numberToGuess = 1234;
    assertEquals("0 cow, 1 bull", cab.guess(2628));
  }

  @Test
  public void guess_1Cow0Bull_ReturnsEqual() {
    cab = new CAB();
    cab.numberToGuess = 1234;
    assertEquals("1 cow, 0 bull", cab.guess(2268));
  }

  @Test
  public void guess_1Cow1Bull_ReturnsEqual() {
    cab = new CAB();
    cab.numberToGuess = 1232;
    assertEquals("1 cow, 1 bull", cab.guess(5225));
  }

  @Test
  public void guess_0Cow4Bull_ReturnsEqual() {
    cab = new CAB();
    cab.numberToGuess = 1122;
    assertEquals("0 cow, 4 bull", cab.guess(2211));
  }


  @Test
  public void guess_0Cow4BullButEveryNumberIsDifferent_ReturnsEqual() {
    cab = new CAB();
    cab.numberToGuess = 1234;
    assertEquals("0 cow, 4 bull", cab.guess(4321));
  }

  @Test
  public void guess_2Cow1Bull_ReturnsEqual() {
    cab = new CAB();
    cab.numberToGuess = 5212;
    assertEquals("2 cow, 1 bull", cab.guess(1222));
  }

  @Test
  public void guess_1Cow2Bull_ReturnsEqual() {
    cab = new CAB();
    cab.numberToGuess = 5445;
    assertEquals("1 cow, 2 bull", cab.guess(5554));
  }
}