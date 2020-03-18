package postit;

import java.awt.Color;

public class Main {
  public static void main(String[] args) {
    PostIt post1 = new PostIt(Color.orange, "Idea 1", Color.blue);
    PostIt post2 = new PostIt(Color.pink, "Awesome", Color.black);
    PostIt post3 = new PostIt(Color.yellow, "Superb!", Color.green);
    System.out.println(post1.backgroundColor + " " + post1.text + " " + post1.textColor);
    System.out.println(post2.backgroundColor + " " + post2.text + " " + post2.textColor);
    System.out.println(post3.backgroundColor + " " + post3.text + " " + post3.textColor);
  }
}
