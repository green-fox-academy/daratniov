package fivetrees;

import java.awt.Color;

public class Tree {
  enum Sex {MALE, FEMALE}

  String type;
  Color leafColor;
  int age;
  Sex sex;

  public Tree(String type, Color leafColor, int age, Sex sex) {
    this.type = type;
    this.leafColor = leafColor;
    this.age = age;
    this.sex = sex;
  }

  public void printTree() {
    System.out.println(type + " : " + leafColor + " : " + age + " : " + sex);
  }
}