package fivetrees;

import java.awt.Color;

public class Main {
  public static void main(String[] args) {

    Forest forest = new Forest();
    forest.addTree(new Tree("Apple", Color.green, 67, Tree.Sex.MALE));
    forest.addTree(new Tree("Birsch", Color.gray, 123, Tree.Sex.MALE));
    forest.addTree(new Tree("Oak", Color.red, 44, Tree.Sex.FEMALE));
    forest.addTree(new Tree("Pine", Color.orange, 12, Tree.Sex.FEMALE));
    forest.addTree(new Tree("Walnut", Color.yellow, 53, Tree.Sex.MALE));
    forest.printForest();
  }
}
