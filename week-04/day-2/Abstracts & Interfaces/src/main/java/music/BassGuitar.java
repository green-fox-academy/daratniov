package main.java.music;

public class BassGuitar extends StringedInstrument {
  public BassGuitar() {
    super.name = "Bass Guitar";
    super.numberOfStrings = 4;
  }

  public BassGuitar(int numberOfStrings) {
    this();
    this.numberOfStrings = numberOfStrings;
  }

  @Override
  public String sound() {
    return "Duum-duum-duum";
  }
}