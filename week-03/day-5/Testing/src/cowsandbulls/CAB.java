package cowsandbulls;

import java.util.Scanner;

public class CAB {
  public enum State {PLAYING, FINISHED}

  public State state;
  public int numberToGuess;
  public int counter;

  public CAB() {
    this.state = State.PLAYING;
    this.numberToGuess = (int) (Math.random() * 9000 + 1000);
    this.counter = 0;
  }

  public String guess(int number) {
    StringBuilder stringNumberToGuess = new StringBuilder();
    StringBuilder stringNumber = new StringBuilder();
    stringNumberToGuess.append(numberToGuess);
    stringNumber.append(number);
    String result = new String();
    int cowCounter = 0;
    int bullCounter = 0;
    if (this.state == State.FINISHED) {
      result = "You have already found the number!";
    } else if (stringNumber.length() != 4) {
      result = "Give me a four digit number!";
    } else if (stringNumberToGuess.toString().equals(stringNumber.toString())) {
      counter++;
      this.state = State.FINISHED;
      result = "You have found the number with " + counter + " guesses!";
    } else {

      for (int i = 0; i < stringNumberToGuess.length(); i++) {
        if (stringNumberToGuess.charAt(i) == stringNumber.charAt(i)) {
          stringNumberToGuess.deleteCharAt(i);
          stringNumber.deleteCharAt(i);
          cowCounter++;
          i--;
        }
      }

      for (int i = 0; i < stringNumberToGuess.length(); i++) {
        for (int j = 0; j < stringNumber.length(); j++) {
          if (stringNumberToGuess.charAt(i) == stringNumber.charAt(j)) {
            stringNumberToGuess.deleteCharAt(i);
            stringNumber.deleteCharAt(j);
            bullCounter++;
            i = 0;
            j = -1;
          }
        }
      }

      counter++;
      result = cowCounter + " cow, " + bullCounter + " bull";
    }
    return result;
  }

  public static void main(String[] args) {
    CAB cab = new CAB();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Guess the number!");
    while (cab.state != State.FINISHED) {
      System.out.println(cab.guess(scanner.nextInt()));
    }
  }
}
