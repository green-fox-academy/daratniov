package gardenapplication;

public class Tree extends Plant {

  public Tree(String color) {
    super(color);
  }

  @Override
  public boolean needsWater() {
    return this.getWaterAmount() < 10;
  }

  @Override
  public void watering(double water) {
    this.setWaterAmount(water * 0.4);
  }

  @Override
  public void print() {
    if (this.needsWater()) {
      System.out.println("The " + this.getColor() + " Tree needs water");
    } else {
      System.out.println("The " + this.getColor() + " Tree doesnt need water");
    }
  }
}
