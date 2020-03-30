package main.java.animals;

public class Mammal extends Animal {
  private boolean isItHuman;
  private boolean livesInWater;

  public Mammal(String name) {
    super.name = name;
  }

  @Override
  public String breed() {
    return "pushing miniature versions out.";
  }
}
