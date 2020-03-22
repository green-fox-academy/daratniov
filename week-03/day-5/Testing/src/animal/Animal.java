package animal;

public class Animal {
  public int hunger;
  public int thirst;

  public Animal() {
    this.hunger = 50;
    this.thirst = 50;
  }

  public void eat() {
    if (this.hunger > 0) {
      this.hunger--;
    }
  }

  public void drink() {
    if (this.thirst > 0) {
      this.thirst--;
    }
  }

  public void play() {
    if (this.hunger < 100) {
      this.hunger++;
    }
    if (this.thirst < 100) {
      this.thirst++;
    }
  }
}