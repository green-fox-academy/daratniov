package doablehomework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoableHomework {
  public static void main(String[] args) {
    List<String[]> treeList = new ArrayList<>();
    System.out.println("Give me the attributions of five trees (type,leaf color,age,sex)");
    for (int i = 1; i <= 4; i++) {
      System.out.println(i + ". tree:");
      treeList.add(createTree());
    }
    for (String[] tree : treeList) {
      printTree(tree);
    }
  }

  private static String[] createTree() {
    String[] tree = new String[4];
    Scanner scanner = new Scanner(System.in);
    System.out.println("Type: ");
    tree[0] = scanner.nextLine();
    System.out.println("Leaf color: ");
    tree[1] = scanner.nextLine();
    System.out.println("Age: ");
    tree[2] = scanner.nextLine();
    System.out.println("Sex: ");
    tree[3] = scanner.nextLine();
    return tree;
  }

  private static void printTree(String[] tree) {
    for (int i = 0; i < tree.length; i++) {
      System.out.print(tree[i] + " ");
    }
    System.out.println();
  }
}