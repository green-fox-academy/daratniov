package flyable;

import main.java.animals.Animal;

public class Bird extends Animal implements Flyable {
  private boolean ableToSing;
  private boolean ableToFly;

  public Bird(String name) {
    super.name = name;
  }

  @Override
  public String breed() {
    return "laying eggs.";
  }

  @Override
  public void land() {
    System.out.println("Stops fluttering with its wings.");
  }

  @Override
  public void fly() {
    System.out.println("Shhhhhhhhhhh");
  }

  @Override
  public void takeOff() {
    System.out.println("Starts fluttering with its wings.");
  }
}
