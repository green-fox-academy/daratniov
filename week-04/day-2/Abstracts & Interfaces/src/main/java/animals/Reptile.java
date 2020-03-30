package main.java.animals;

public class Reptile extends Animal {
  private boolean poisonous;
  private boolean isItExtinct;

  public Reptile(String name) {
    super.name = name;
  }

  @Override
  public String breed() {
    return "laying eggs.";
  }
}
