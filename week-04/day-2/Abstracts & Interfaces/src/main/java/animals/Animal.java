package main.java.animals;

public abstract class Animal {
  protected String name;
  protected int age;
  protected Gender gender;
  protected boolean isPredator;
  protected boolean numberOfLegs;

  public String getName() {
    return this.name;
  }

  public abstract String breed();
}
