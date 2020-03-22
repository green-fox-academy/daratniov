package sharpie;

public class Sharpie {
  public String color;
  public double width;
  public int inkAmount;

  public Sharpie(String color, double width) {
    if (color.length() != 0) {
      this.color = color;
    }
    this.width = width;
    this.inkAmount = 100;
  }

  public void use() {
    if (inkAmount > 0) {
      this.inkAmount--;
    }
  }
}