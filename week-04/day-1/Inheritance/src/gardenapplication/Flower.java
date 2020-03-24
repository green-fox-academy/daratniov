package gardenapplication;

public class Flower extends Plant {

  public Flower(String color) {
    super(color);
  }

  @Override
  public boolean needsWater() {
    return this.getWaterAmount() < 5;
  }

  @Override
  public void watering(double water) {
    this.setWaterAmount(water * 0.75);
  }

  @Override
  public void print() {
    if (this.needsWater()) {
      System.out.println("The " + this.getColor() + " Flower needs water");
    } else {
      System.out.println("The " + this.getColor() + " Flower doesnt need water");
    }
  }
}
