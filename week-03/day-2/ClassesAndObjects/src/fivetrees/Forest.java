package fivetrees;

import java.util.ArrayList;
import java.util.List;

public class Forest {
  List<Tree> listOfTrees;

  public Forest() {
    listOfTrees = new ArrayList<>();
  }

  public void addTree(Tree tree) {
    listOfTrees.add(tree);
  }

  public void printForest() {
    for (Tree tree : listOfTrees) {
      tree.printTree();
    }
  }
}
