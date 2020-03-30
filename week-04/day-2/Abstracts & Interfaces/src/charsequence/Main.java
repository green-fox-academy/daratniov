package charsequence;

public class Main {
  public static void main(String[] args) {
    String string = "example";
    Gnirts gnirts = new Gnirts(string);
    Shifter shifter = new Shifter(string, 2);
    System.out.println(string.length());
    System.out.println(gnirts.length());
    System.out.println(shifter.length());
    System.out.println(string.charAt(3));
    System.out.println(gnirts.charAt(3));
    System.out.println(shifter.charAt(3));
    System.out.println(string.subSequence(1, 3));
    System.out.println(gnirts.subSequence(1, 3));
    System.out.println(shifter.subSequence(1, 3));
  }
}
