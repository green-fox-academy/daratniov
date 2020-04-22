package exercise12;

public class StarWarsCharacter {
  private String name;
  private String height;
  private String mass;
  private String hairColor;
  private String skinColor;
  private String eyeColor;
  private String birthYear;
  private String gender;

  public StarWarsCharacter(String name, String height, String mass, String hairColor, String skinColor, String eyeColor, String birthYear, String gender) {
    this.name = name;
    this.height = height;
    this.mass = mass;
    this.hairColor = hairColor;
    this.skinColor = skinColor;
    this.eyeColor = eyeColor;
    this.birthYear = birthYear;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public String getHeight() {
    return height;
  }

  public String getMass() {
    return this.mass.replace(",", "");
  }

  public String getHairColor() {
    return hairColor;
  }

  public String getSkinColor() {
    return skinColor;
  }

  public String getEyeColor() {
    return eyeColor;
  }

  public String getBirthYear() {
    return birthYear;
  }

  public String getGender() {
    return gender;
  }
}
