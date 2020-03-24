package gardenapplication;

public class Plant {
  private double waterAmount;
  private String color;

  public Plant(String color) {
    this.waterAmount = 0;
    this.color = color;
  }

  public double getWaterAmount() {
    return waterAmount;
  }

  public void setWaterAmount(double waterAmount) {
    this.waterAmount += waterAmount;
  }

  public String getColor() {
    return color;
  }

  public boolean needsWater() {
    return waterAmount <= 0;
  }

  public void watering(double water) {
    waterAmount += water;
  }

  public void print() {
    if (this.needsWater()) {
      System.out.println("The " + this.color + " Plant needs water");
    } else {
      System.out.println("The " + this.color + " Plant doesnt need water");
    }
  }
}
